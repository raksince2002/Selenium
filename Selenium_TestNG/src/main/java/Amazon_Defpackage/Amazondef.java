package Amazon_Defpackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazondef {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
	}
	
	public void launch() throws InterruptedException {
		
		Thread.sleep(3000);
		wd.get("https://www.amazon.in/");
		
	}
	
	public void search(String inp) throws InterruptedException {
		wd.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(inp);
		 
		Thread.sleep(3000);
		
//		List<String> l = wd.findElement(null) 
		
		List <WebElement> list = (List<WebElement>) wd.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div[1]/div[1]/div"));
		
		List<String> l = new ArrayList<String>();
		
		for(int i=0;i<list.size();i++) {
			l.add(list.get(i).getText());
		}
		
		System.out.println(l);
		
		wd.findElement(By.name(""));
		
	}
	
	
	
}
