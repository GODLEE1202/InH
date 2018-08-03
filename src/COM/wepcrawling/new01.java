package COM.wepcrawling;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class new01 {

	public static void main(String[] args) throws IOException {
		String url ="https://www.lipsum.com/";
		Document doc = Jsoup.connect(url).get();
		Elements elem = doc.select("#Content");
		String str = elem.text();

		Path path = Paths.get("D:\\JavaWepCrawling/text4.txt");
		FileChannel file = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		ByteBuffer bb = ByteBuffer.wrap(str.getBytes());
		file.write(bb);
		file.close();
		bb.clear();
	}

}
