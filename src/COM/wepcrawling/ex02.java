package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex02 {
	public static void main(String[] args) throws IOException {
		
		String url ="http://news.naver.com";
		Document doc = Jsoup.connect(url).get();
		Elements elem = doc.select("a");
		String str = "";
		
		for(Element el : elem) {
			str += el.attr("href");
			System.out.println(str);	
				
		}	
	}
	
}
