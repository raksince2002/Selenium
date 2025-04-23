package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropDownDemo {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;	
		wd.get("https://www.amazon.in/");
	}
	
	public void select() throws InterruptedException {
		
		WebElement we = wd.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(we);
		Thread.sleep(3000);
//		s.selectByVisibleText("Amazon Devices");
		
//		s.selectByValue("search-alias=amazon-devices");
		
		
	}
	
	public List<WebElement> listoptions(){
		
		WebElement we = wd.findElement(By.id("searchDropdownBox"));
		Select s = new Select(we);
		List<WebElement> l = s.getOptions();
		l.remove(0);
		return l;
		
	}
	
	public int countofImages() {
//		WebElement we = (WebElement) 
		List<WebElement> l = (List<WebElement>) wd.findElements(By.tagName("img"));
		return l.size();
	}
	
	
	
	
	
}
