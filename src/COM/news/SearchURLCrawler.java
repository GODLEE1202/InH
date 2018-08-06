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
		
		//몽고 디비 연결
		String MongoDB_IP = "localhost";	//IP
		int MongoDB_PORT = 27017;			//DB포트
		String DB_NAME = "newsDB"; 			//DB이름
				
		//몽고 디비 연결
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP,MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);					//DB 생성
		DBCollection NewsCollection = db.getCollection("NEWSDATABASE"); //DB에 넣을 콜렉션 생성 
		
		BasicDBObject NewsDoc = new BasicDBObject(); //콜렉션에 넣을 오브젝트생성
		
		//언론사 리스트를 만들 코드
		
		String listURL = "https://news.naver.com/main/officeList.nhn";//언론사 목록을 가져올 네이버 뉴스 언론사리스트URL
		String searchURL = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query="; //네이버 검색을 통해 언론사 URL을 뽑아올 네이버검색URL
		
		try {
		Document newslist_doc = Jsoup.connect(listURL).get();//언론사리스트URL
		Elements newslist_els = newslist_doc.select("#groupOfficeList > table > tbody > tr > td > ul > li > a");
		
		String newslist = newslist_els.text();
		String[] newslist_result = newslist.split("\\s");
		
		int i =0;
		for (String str : newslist_result) {
			try {
				Document newslist_url_doc = Jsoup.connect(searchURL+str).get(); //검색URL
				Elements newslist_url_els = newslist_url_doc.select("#main_pack > div > ul > li > dl > dt > span.url_area > a");
				
				String newslist_url = null;
				for (Element el : newslist_url_els) {
					newslist_url = el.attr("href");
					System.out.println(str + " " + newslist_url);
					
					NewsDoc.put("Number", i++);
					NewsDoc.put("언론사", str);
					NewsDoc.put("URL", newslist_url);
					
					//NewsCollection.insert(NewsDoc);//컬렉션 저장
					NewsDoc.clear();//초기화
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
		}
		}catch (Exception e) {
			e.getMessage();
		}
		try {
		//저장된 URL들에 들어가서 search하는 코드
			//셀레니움 크롬 드라이버 설정		
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
			
			//몽고디비에서 URL가져오기
			//쿼리 작성
			BasicDBObject allQuery = new BasicDBObject();
			BasicDBObject fields = new BasicDBObject();
			
			fields.put("URL", 1);
			DBCursor cursor = NewsCollection.find(allQuery,fields);
			
			WebDriver driver = new ChromeDriver();
			
			while (cursor.hasNext()) {
			//System.out.println(cursor.next().get("URL"));	
			
				driver.get((String)cursor.next().get("URL"));// URL 넣기 
			//새탭에 열기
				//((JavascriptExecutor)driver).executeScript("window.open()");
			   // ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			    //driver.switchTo().window(tabs.);
			//사이트 분석
				driver.findElement(By.className("search_btn")).click();
				driver.findElement(By.name("q")).sendKeys("비트코인");
				driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				
				//driver.findElement(By.className("keyword")).sendKeys("비트코인");
				System.out.println("비트코인 검색");
				Thread.sleep(5000);
				
			//단어 검색하기
			//기사제목, 날짜, 기사내용, 기자, 댓글 DB에 넣기
			}
			
		}
		catch (Exception e) {
			System.out.println("문제는 : " + e.getMessage());
		}
	}

}
