package Waiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingDemo {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://www.google.com/");
	}
	
	public void wait_implicit() {
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.findElement(By.className("gLFyf")).sendKeys("Test Implicit wait check");
		
		
		
	}
	
	public void wait_explicit() {
		
		wd.get("https://www.orangetravels.in/#/");
		WebDriverWait w = new WebDriverWait(wd,Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		
		
		
		
		
	}

}
