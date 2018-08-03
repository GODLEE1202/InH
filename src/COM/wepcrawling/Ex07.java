package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://news.naver.com/")
				.get();
		Elements a = doc.select("a");
		
		for(Element el : a) {
			
			//태그 안의 속성 이름을 통해 값을 가져온다.
			//System.out.println(el.attr("href").indexOf("http://news.naver.com/",0));
			
			if(el.attr("href").indexOf("http://news.naver.com/",0)>=0) {
				Document subdoc = Jsoup.connect(el.attr("href")).get();
				
				Elements elem = subdoc.select("#articleBodyContents");
				
				String str = elem.text();
				System.out.println(str);
			}
		
		
		}

	}

}
