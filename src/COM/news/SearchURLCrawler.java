package COM.news;

import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class SearchURLCrawler {

	
	public static void main(String[] args) {
		
		//���� ��� ����
		String MongoDB_IP = "localhost";	//IP
		int MongoDB_PORT = 27017;			//DB��Ʈ
		String DB_NAME = "newsDB"; 			//DB�̸�
				
		//���� ��� ����
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP,MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);					//DB ����
		DBCollection NewsCollection = db.getCollection("NEWSDATABASE"); //DB�� ���� �ݷ��� ���� 
		
		BasicDBObject NewsDoc = new BasicDBObject(); //�ݷ��ǿ� ���� ������Ʈ����
			
		String listURL = "https://news.naver.com/main/officeList.nhn";
		String searchURL = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=";
		
		try {
		Document newslist_doc = Jsoup.connect(listURL).get();
		Elements newslist_els = newslist_doc.select("#groupOfficeList > table > tbody > tr > td > ul > li > a");
		
		String newslist = newslist_els.text();
		String[] newslist_result = newslist.split("\\s");
		
		int i =0;
		for (String str : newslist_result) {
			try {
				Document newslist_url_doc = Jsoup.connect(searchURL+str).get();
				Elements newslist_url_els = newslist_url_doc.select("#main_pack > div > ul > li > dl > dt > span.url_area > a");
				
				
				
				String newslist_url = null;
				for (Element el : newslist_url_els) {
					newslist_url = el.attr("href");
					System.out.println(str + " " + newslist_url);
					NewsDoc.put("Number", i++);
					NewsDoc.put("��л�", str);
					NewsDoc.put("URL", newslist_url);
					
					Thread.sleep(500);
					
					NewsCollection.insert(NewsDoc);
					NewsDoc.clear();
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		}
		
		catch (Exception e) {
			
		}
			
		
		
		
		
		
//		Document urldoc = Jsoup.connect(searchURL+newslist).get();
//		Elements urllinks = urldoc.select("#url_area");
//		String newsURL = urllinks.attr("a:href");
//		System.out.println(urllinks);
//
	}

}
