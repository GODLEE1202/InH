package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Ex03_ {
	//���������� �ʿ��� �κи� ��������
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")
				.get();		//get����̳� post���
		
		//System.out.println(doc.text());
		
		//������Ʈ���� Ctrl+Shift+C�� ������ �ʿ��� �κ� �����ϰ� id����
		//�ش� selector�� �����ϴ� �������� ���� �ܾ��
		Elements body = doc.select("#content");
		//elements���� �ؽ�Ʈ �����͵��� ���� ��������
		
		String str = body.text();
		System.out.println(str);
		
		
	}

}
