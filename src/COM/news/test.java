package COM.news;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class test {
public static void main(String[] args) {
	//몽고 디비 연결
			String MongoDB_IP = "localhost";	//IP
			int MongoDB_PORT = 27017;			//DB포트
			String DB_NAME = "newsDB"; 			//DB이름
					
	MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP,MongoDB_PORT));
	DB db = mongoClient.getDB(DB_NAME);					//DB 생성
	DBCollection NewsCollection = db.getCollection("NEWSDATABASE"); //DB에 넣을 콜렉션 생성 
	
	//몽고디비에서 URL가져오기
	//DBCursor results = NewsCollection.find(new BasicDBObject("Number", 1));
	//System.out.println(results.next());
//	String result;
//	BasicDBObject query = new BasicDBObject();
//	BasicDBObject field = new BasicDBObject();
//	field.put("Number", 1);
//	DBCursor cursor = NewsCollection.find(query,field);
//	while (cursor.hasNext()) {
//	    BasicDBObject obj = (BasicDBObject) cursor.next().get("URL");
//	    System.out.println(obj);
//	}
	DBCursor cursor = NewsCollection.find();
	
	while(cursor.hasNext()){
		System.out.println(cursor.next());	
	}
	
}
}
