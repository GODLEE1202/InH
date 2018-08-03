package COM.wepcrawling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		String url = "http://news.naver.com";
		Document doc = Jsoup.connect(url).get();
		Elements a = doc.select("a");
		String str = "";
		
		for(Element el : a) {
			str += el.attr("href");
			str += "\r\n";
			
		}
		
		
		/*
		 * ±¸ ¹æ½Ä
		 * 
		 * BufferedWriter br = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("D:\\JavaWepCrawling/text1.txt")
						)
				);
		br.write(str);
		br.close();*/
		
		Path path = Paths.get("D:\\JavaWepCrawling/text2.txt");
		FileChannel file = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		ByteBuffer bb = ByteBuffer.wrap(str.getBytes());
		file.write(bb);
		file.close();
		bb.clear();
		
		

	}

}
