package COM.wepcrawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

public class Ex02_ {
	//���ٷ� �ۼ��ϱ�
	public static void main(String[] args) throws IOException {
	/*	Response resp = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")//�̰����ؼ� ���ϴ� ������ �޾ƿ���
				.header("",	"")//403������ �߻��� : header�� ���� �����Ͽ� �����ؾ� �Ѵ�.
				.method(Method.GET)	//POST������� GET������� ���ϱ�
				.execute(); 	//����
	*/
		
		//���� �����ϴµ� �־� 403�̳� ��Ÿ ������ �߻����� �������
		Document doc = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")
				.get();		//get����̳� post���
		System.out.println(doc);
		
	
	
	
	}
}
