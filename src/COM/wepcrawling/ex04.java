package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex04 {

	public static void main(String[] args)	throws IOException {
		String url ="http://search.daum.net/search?w=tot&q=%EC%95%BC%EA%B5%AC%EC%88%9C%EC%9C%84";
		
		Document doc = Jsoup.connect(url).get();
		
		Elements team_rank = doc.select("#abtColl > div.coll_cont > div > div.tab_body > div:nth-child(2) > div > table > tbody");
		
		String str = team_rank.text();
		
		System.out.println(str);
		
		
	}

	

}
