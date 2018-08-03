package COM.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;


public class controller {

	public static void main(String[] args) {
		//몽고 디비 연결
				String MongoDB_IP = "localhost";	//IP
				int MongoDB_PORT = 27017;			//DB포트
				String DB_NAME = "newsDB"; 			//DB이름
						
				//몽고 디비 연결
				MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP,MongoDB_PORT));
				DB db = mongoClient.getDB(DB_NAME);					//DB 생성
				DBCollection NewsCollection = db.getCollection("NEWSDATABASE"); //DB에 넣을 콜렉션 생성 

		NewsCollection.fin
		
		final int LIMIT = 4;
		List<String> seedList = new ArrayList<>();
		seedList.add("https:");
        seedList.add("https:");
        seedList.add("https:");
        seedList.add("https:");
		
        DataStruc[] data = new DataStruc[LIMIT];
        
        for (int i = 0; i < LIMIT; i++) {
			data[i] = new DataStruc(seedList.get(i)); //seedList에 있는 URL을 data[i]에 넣는다
			
		}
        
        ExecutorService es = Executors.newFixedThreadPool(LIMIT); //LIMIT만큼 크기가 정해진 쓰레드 풀을 정의
        Crawler[] crawl = new Crawler[LIMIT]; //크롤러 변수 정의
        for (int i = 0; i < LIMIT; i++) {
			crawl[i] = new Crawler(data[i]); //data[i]의 URL을 crawl[i]에 넣는다. 
			
		}
        for (int i = 0; i < LIMIT; i++) {
        	es.submit(crawl[i]); //submit은 crawl[i]를 실행하는 명령어
			
		}
	}

}
