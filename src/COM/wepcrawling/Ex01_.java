package COM.wepcrawling;

import java.io.IOException;

import org.jsoup.Connection.Method;

import org.jsoup.Connection.Response;	//�������̽�

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

public class Ex01_ {
	//jsoup.jar���� �����о� �ϱ�
	//������ ��������
	public static void main(String[] args) throws IOException {		//IOException�� �־�� ��
		//Response(�����û) ��ü ����
		Response resp = Jsoup.connect("http://finance.naver.com/news/news_read.nhn?mode=mainnews&office_id=003&article_id=0008618547")//�̰����ؼ� ���ϴ� ������ �޾ƿ���
				.method(Method.GET)	//POST������� GET������� ���ϱ�
				.execute(); 	//����
		
		// resp�� �Ľ��Ͽ� �츮�� ���ϴ� ������ ���� Document ��� ���·� ���� /parse(�м�)
		Document doc = resp.parse();
		
		//doc���� html�±� ���¸� String���·� ����
		String html = doc.html();
		
		//doc���� html�±� �� ��ũ��Ʈ�� ������ ���ڸ� ����.
		String text = doc.text();
		
		//���
		//System.out.println(html);
	
		//���
		System.out.println(text);
	}
}
