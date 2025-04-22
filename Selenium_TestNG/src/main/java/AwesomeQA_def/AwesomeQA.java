package AwesomeQA_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwesomeQA {
	
	WebDriver wd ;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://awesomeqa.com/ui/index.php?route=account/register");
	}
	
	public boolean radio() {
		WebElement w = wd.findElement(By.xpath("//input[@name='newsletter'] [@value='1']"));
		
		w.click();
		return w.isEnabled();
	}
	
	
}
