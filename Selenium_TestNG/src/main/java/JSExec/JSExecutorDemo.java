package JSExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
//		wd.get("https://awesomeqa.com/ui/index.php?route=account/login");
		wd.get("https://www.amazon.in/");
		wd.manage().window().setSize(new org.openqa.selenium.Dimension(500,500));
	}
	
	public void demo() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)wd;
		Thread.sleep(2000);
		
//		WebElement em = wd.findElement(By.id("input-email"));
//		WebElement pw = wd.findElement(By.id("input-password"));
//		WebElement log = wd.findElement(By.xpath("//input[@type='submit']"));
		
		WebElement drop = wd.findElement(By.id("searchDropdownBox"));
		WebElement choose = wd.findElement(By.xpath("//option[@value='search-alias=amazon-devices']"));
		
//		js.executeScript("arguments[0].value = 'Rakesh@gmail.com'", em);
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].value = 'bnbnhnhnh435435'", pw);
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].click()", log);
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].value", drop);
		Thread.sleep(5000);
		js.executeScript("arguments[0].value", choose);
		
		
		
	}

}
