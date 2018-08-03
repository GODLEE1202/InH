package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Ex04_ {

	//필요 없는 부분 삭제
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")
				.get();
		
		//remove를 사용하여 해당 태그 제거
		Elements strong = doc.select("strong");
		strong.remove();
		Elements span = doc.select(".end_photo_org");
		span.remove();
		
		//웹사이트에서 Ctrl+Shift+C를 눌러서 필요한 부분 선택하고 id복사
		//해당 selector에 존재하는 컨텐츠를 전부 긁어옴
		Elements body = doc.select("#content");
		//elements에서 텍스트 데이터들을 전부 가져오기
				
		String str = body.text();
		System.out.println(str);
	}

}
