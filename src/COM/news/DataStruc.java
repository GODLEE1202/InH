package COM.news;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DataStruc {
	 
	
	private ConcurrentLinkedQueue<String> url_to_visit = new ConcurrentLinkedQueue<String>(); //������ Ǯ���� ������ ť�� ConcurrentLinkedQueue�� StringŸ���� url_to_visit�� ����
	
	private ArrayList<String> visited_url = new ArrayList<String>();// �湮�� url�� ���� ArrayList�� ����
	
	public DataStruc(String initial_url) {//ó�� url�� ����
		url_to_visit.offer(initial_url);//offer ��ɾ�� ť�� �״� ��ɾ� poll�� ���� ��ɾ�
	}
	public void addURL(String url) {
		url_to_visit.offer(url);	//url_to_visitť�� url�� ����
	}
	public void addContent(String content) {
		url_to_visit.offer(content);	//url_to_visitť�� �������� ����
	}
	public String getURL() {
		return url_to_visit.poll(); //poll��ɾ�� ť�� ���� �����͸� ���� ��ɾ�
	}
	 public int url_to_visit_size() {
	        return url_to_visit.size(); //���� ť�� ����� ������
	    }
	 public void addVisitedURL(String url) { //ArrayList visited_url�� ���� url�� �߰��� 
	        visited_url.add(url);
	    }
	 public boolean oldLink(String link) {//link�� ���� �� ����Ʈ�� url�� ArrayList���� ������ �ٸ����� üũ
	        for(String s : visited_url) {
	            if(s.equals(link)) {
	                return true;
	            }
	        }   
	        return false;
	    }     
}
