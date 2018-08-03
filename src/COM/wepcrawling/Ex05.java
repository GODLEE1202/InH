package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://news.naver.com/")
				.get();
		
		Elements a = doc.select("a");
		
		for(Element el : a) {
			System.out.println(el.text());
			
			
		}
		
		

	}

}
