package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Ex04_ {

	//�ʿ� ���� �κ� ����
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")
				.get();
		
		//remove�� ����Ͽ� �ش� �±� ����
		Elements strong = doc.select("strong");
		strong.remove();
		Elements span = doc.select(".end_photo_org");
		span.remove();
		
		//������Ʈ���� Ctrl+Shift+C�� ������ �ʿ��� �κ� �����ϰ� id����
		//�ش� selector�� �����ϴ� �������� ���� �ܾ��
		Elements body = doc.select("#content");
		//elements���� �ؽ�Ʈ �����͵��� ���� ��������
				
		String str = body.text();
		System.out.println(str);
	}

}
