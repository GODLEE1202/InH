package COM.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
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
		
		//��л� ����Ʈ�� ���� �ڵ�
		
		String listURL = "https://news.naver.com/main/officeList.nhn";//��л� ����� ������ ���̹� ���� ��л縮��ƮURL
		String searchURL = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query="; //���̹� �˻��� ���� ��л� URL�� �̾ƿ� ���̹��˻�URL
		
		try {
		Document newslist_doc = Jsoup.connect(listURL).get();//��л縮��ƮURL
		Elements newslist_els = newslist_doc.select("#groupOfficeList > table > tbody > tr > td > ul > li > a");
		
		String newslist = newslist_els.text();
		String[] newslist_result = newslist.split("\\s");
		
		int i =0;
		for (String str : newslist_result) {
			try {
				Document newslist_url_doc = Jsoup.connect(searchURL+str).get(); //�˻�URL
				Elements newslist_url_els = newslist_url_doc.select("#main_pack > div > ul > li > dl > dt > span.url_area > a");
				
				String newslist_url = null;
				for (Element el : newslist_url_els) {
					newslist_url = el.attr("href");
					System.out.println(str + " " + newslist_url);
					
					NewsDoc.put("Number", i++);
					NewsDoc.put("��л�", str);
					NewsDoc.put("URL", newslist_url);
					
					//NewsCollection.insert(NewsDoc);//�÷��� ����
					NewsDoc.clear();//�ʱ�ȭ
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
		}
		}catch (Exception e) {
			e.getMessage();
		}
		try {
		//����� URL�鿡 ���� search�ϴ� �ڵ�
			//�����Ͽ� ũ�� ����̹� ����		
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
			
			//�����񿡼� URL��������
			//���� �ۼ�
			BasicDBObject allQuery = new BasicDBObject();
			BasicDBObject fields = new BasicDBObject();
			
			fields.put("URL", 1);
			DBCursor cursor = NewsCollection.find(allQuery,fields);
			
			WebDriver driver = new ChromeDriver();
			
			while (cursor.hasNext()) {
			//System.out.println(cursor.next().get("URL"));	
			
				driver.get((String)cursor.next().get("URL"));// URL �ֱ� 
			//���ǿ� ����
				//((JavascriptExecutor)driver).executeScript("window.open()");
			   // ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			    //driver.switchTo().window(tabs.);
			//����Ʈ �м�
				driver.findElement(By.className("search_btn")).click();
				driver.findElement(By.name("q")).sendKeys("��Ʈ����");
				driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				
				//driver.findElement(By.className("keyword")).sendKeys("��Ʈ����");
				System.out.println("��Ʈ���� �˻�");
				Thread.sleep(5000);
				
			//�ܾ� �˻��ϱ�
			//�������, ��¥, ��系��, ����, ��� DB�� �ֱ�
			}
			
		}
		catch (Exception e) {
			System.out.println("������ : " + e.getMessage());
		}
	}

}
