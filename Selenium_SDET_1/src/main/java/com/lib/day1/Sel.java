package com.lib.day1;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class Sel {
	
	WebDriver wd;
	
	public void init_Web(WebDriver wd) throws InterruptedException {
		this.wd = wd;
		Thread.sleep(2000);
		wd.get("https://www.google.com");
	}
	
	
	
	public String title_display() throws InterruptedException {
		
		Thread.sleep(2000);
		return (wd.getTitle());
		
	}
	
	public void extract_PageSource() throws InterruptedException {
		
		String page = wd.getPageSource();
		Thread.sleep(2000);
		System.out.println(page);
		
	}
	
	public String find() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(2000);
		return wd.getCurrentUrl();
	}
	
	public String navigate_demo() throws InterruptedException {
		wd.get("https://www.google.com/imghp?hl=en&ogbl");
//		wd.get("https://www.google.com");
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		return wd.getCurrentUrl();
	}
	
	public void maximize() {
		wd.manage().window().maximize();
	}
	
	public void close() {
		if(wd!=null) {
			wd.quit();
		}
	}
	
}
