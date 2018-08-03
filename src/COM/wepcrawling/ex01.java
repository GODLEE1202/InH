package COM.wepcrawling;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ex01 {

	public static void main(String[] args) throws IOException {
		String url ="http://news.naver.com/main/hotissue/read.nhn?mid=hot&sid1=100&cid=1079165&iid=2751324&oid=056&aid=0010580741&ptype=052";
		Document doc = Jsoup.connect(url).get();
		Elements elem = doc.select("#articleTitle");
		String str = elem.text();
		
		System.out.println(str);
	}

}
