package test;

import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class DotaTest {
	
	public static String lesh = "http://dotabuff.com/heroes/leshrac/matchups";
	
	public static int count = 0;
	
	public static void main(String[] args) {
		try{
			
			Document doc = Jsoup.connect(lesh).data("query", "Java").userAgent("Chrome").cookie("auth", "token").timeout(3000).get();
			
			Elements els = doc.select("table");
			
			Elements name = els.select("td.cell-xlarge").select("a.link-type-hero");
			
			System.out.println(name.html().toLowerCase().replace(" ", "-"));
			
			System.out.println(System.lineSeparator());
			
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
	
}
