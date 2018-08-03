package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Connection.Method;

import org.jsoup.Connection.Response;	//인터페이스

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

public class Ex01_ {
	//jsoup.jar파일 빌드패쓰 하기
	//데이터 가져오기
	public static void main(String[] args) throws IOException {		//IOException이 있어야 함
		//Response(응답요청) 객체 생성
		Response resp = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")//이걸통해서 원하는 데이터 받아오기
				.method(Method.GET)	//POST방식인지 GET방식인지 정하기
				.execute(); 	//실행
		
		// resp를 파싱하여 우리가 원하는 데이터 값을 Document 라는 형태로 저장 /parse(분석)
		Document doc = resp.parse();
		
		//doc에서 html태그 형태를 String형태로 전달
		String html = doc.html();
		
		//doc에서 html태그 및 스크립트를 제외한 문자만 전달.
		String text = doc.text();
		
		//출력
		//System.out.println(html);
	
		//출력
		System.out.println(text);
	}
}
