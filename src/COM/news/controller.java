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
		//���� ��� ����
				String MongoDB_IP = "localhost";	//IP
				int MongoDB_PORT = 27017;			//DB��Ʈ
				String DB_NAME = "newsDB"; 			//DB�̸�
						
				//���� ��� ����
				MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP,MongoDB_PORT));
				DB db = mongoClient.getDB(DB_NAME);					//DB ����
				DBCollection NewsCollection = db.getCollection("NEWSDATABASE"); //DB�� ���� �ݷ��� ���� 

		NewsCollection.fin
		
		final int LIMIT = 4;
		List<String> seedList = new ArrayList<>();
		seedList.add("https:");
        seedList.add("https:");
        seedList.add("https:");
        seedList.add("https:");
		
        DataStruc[] data = new DataStruc[LIMIT];
        
        for (int i = 0; i < LIMIT; i++) {
			data[i] = new DataStruc(seedList.get(i)); //seedList�� �ִ� URL�� data[i]�� �ִ´�
			
		}
        
        ExecutorService es = Executors.newFixedThreadPool(LIMIT); //LIMIT��ŭ ũ�Ⱑ ������ ������ Ǯ�� ����
        Crawler[] crawl = new Crawler[LIMIT]; //ũ�ѷ� ���� ����
        for (int i = 0; i < LIMIT; i++) {
			crawl[i] = new Crawler(data[i]); //data[i]�� URL�� crawl[i]�� �ִ´�. 
			
		}
        for (int i = 0; i < LIMIT; i++) {
        	es.submit(crawl[i]); //submit�� crawl[i]�� �����ϴ� ��ɾ�
			
		}
	}

}
