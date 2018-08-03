package COM.wepcrawling;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex03 {

	public static void main(String[] args) throws IOException {
		String url ="https://movie.naver.com/movie/point/af/list.nhn?&page=1";
		Document doc = Jsoup.connect(url).get();
		Elements elem = doc.select("tbody > tr");
		String str = elem.text();		
		
			
			System.out.println(str);
		
	}

}
