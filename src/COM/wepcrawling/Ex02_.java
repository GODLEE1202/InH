package COM.wepcrawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

public class Ex02_ {
	//한줄로 작성하기
	public static void main(String[] args) throws IOException {
	/*	Response resp = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")//이걸통해서 원하는 데이터 받아오기
				.header("",	"")//403에러가 발생시 : header를 직접 삽입하여 전송해야 한다.
				.method(Method.GET)	//POST방식인지 GET방식인지 정하기
				.execute(); 	//실행
	*/
		
		//웹을 접근하는데 있어 403이나 기타 에러가 발생하지 않을경우
		Document doc = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")
				.get();		//get방식이나 post방식
		System.out.println(doc);
		
	
	
	
	}
}
