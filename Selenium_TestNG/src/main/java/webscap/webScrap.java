package webscap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webScrap {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://www.w3schools.com/html/html_tables.asp");
	}
	
	public void get_table() {
		
		List<WebElement> l = wd.findElements(By.id("customers"));
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getText());
		}
		
	}

}
