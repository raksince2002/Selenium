package Google_Package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleSearch {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		
		//wd.get("https://www.google.com/");
	}
	
	public List<String> search(String text) throws InterruptedException {
		wd.get("https://www.google.com/");
		wd.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(text);
		Thread.sleep(3000);
//		List <WebElement> list = (List<WebElement>) wd.findElements(By.xpath("//li[@data-view-type='1']"));
		
		List <WebElement> list = (List<WebElement>) wd.findElements(By.tagName("a"));
		List<String> l1 = new ArrayList<String>();
		
		for(int i=0;i<=list.size()-1;i++) {
			String val= list.get(i).getText();
			l1.add(val);
		}
//		String text1 = wd.findElement(By.xpath("//li[@data-view-type='1'][3]")).getText();
//		
//		System.out.println(text1);
		return l1;
		

	}
	
	
	


}
