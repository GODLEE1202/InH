package COM.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler extends Thread{
	DataStruc data;
	
	private final int INDEX_LIMIT = 10;
	
	public Crawler(DataStruc d) {
		data = d;
		
	}
	public void run() {
		int counter = 0;
		
		while((data.url_to_visit_size() > 0) && counter< INDEX_LIMIT) {	//url_to_visit큐에 쌓인 데이터가 0보다 크고 counter가 최대값을 넘지 않을때까지
			String currentUrl = data.getURL();
			
			try {
				Document doc = Jsoup.connect(currentUrl).timeout(12000).get(); //currentUrl을 연결할때 12초를 기다리며 
				counter++;
				Elements links = doc.select("#groupOfficeList > table > tbody > tr > td > ul > li > a"); //Elements에 doc에서 get한 것들을 select해서 elements에 넣는다.
				
				String newslists = links.text();
				System.out.println(newslists);
				
				
				addLinksToQueue(links); //elements를 addLinksToQueue함수에 돌린다.
			} 
			
			catch (Exception e) {
				System.out.println("Error: "+currentUrl);
			}
		}
	}
	public void addLinksToQueue(Elements el) {
		for(Element e: el) { //elements만큼 element를 돌림 
			String theLink = el.text();
		
			String theCont = e.attr("dir");
			if(theLink.startsWith("http")&& !data.oldLink(theLink)) { //
				data.addURL(theLink);
				data.addVisitedURL(theLink);
				data.addContent(theCont);
				System.out.println(theLink);
			}
		}
	}
	
}