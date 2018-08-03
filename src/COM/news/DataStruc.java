package COM.news;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DataStruc {
	 
	
	private ConcurrentLinkedQueue<String> url_to_visit = new ConcurrentLinkedQueue<String>(); //쓰레드 풀에서 안전한 큐인 ConcurrentLinkedQueue에 String타입의 url_to_visit을 생성
	
	private ArrayList<String> visited_url = new ArrayList<String>();// 방문한 url을 넣을 ArrayList를 생성
	
	public DataStruc(String initial_url) {//처음 url을 받음
		url_to_visit.offer(initial_url);//offer 명령어는 큐에 쌓는 명령어 poll은 빼는 명령어
	}
	public void addURL(String url) {
		url_to_visit.offer(url);	//url_to_visit큐에 url을 쌓음
	}
	public void addContent(String content) {
		url_to_visit.offer(content);	//url_to_visit큐에 컨텐츠를 쌓음
	}
	public String getURL() {
		return url_to_visit.poll(); //poll명령어는 큐에 쌓인 데이터를 빼는 명령어
	}
	 public int url_to_visit_size() {
	        return url_to_visit.size(); //쌓은 큐의 사이즈를 리턴함
	    }
	 public void addVisitedURL(String url) { //ArrayList visited_url에 받은 url을 추가함 
	        visited_url.add(url);
	    }
	 public boolean oldLink(String link) {//link로 받은 들어간 사이트의 url을 ArrayList에서 같은지 다른지를 체크
	        for(String s : visited_url) {
	            if(s.equals(link)) {
	                return true;
	            }
	        }   
	        return false;
	    }     
}
