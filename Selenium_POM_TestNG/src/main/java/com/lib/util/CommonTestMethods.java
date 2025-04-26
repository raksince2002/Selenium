package com.lib.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class CommonTestMethods {

	WebDriver wd;
	
	public void init_common(WebDriver wd) {
		this.wd= wd;
	}
	
	public String launch(String path,By w) throws IOException {
		FileReader fr = new FileReader(path);
		Properties p = new Properties();
		p.load(fr);
		wd.get(p.getProperty("BaseUrl"));
		
		String l = wd.findElement(w).getText();
		
		return l;
	}
	
	
	
	public void Max_Browser() { 
		wd.manage().window().maximize();
	} 
	
	public void implicit_wait(int t) throws InterruptedException { 
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(t)); 
		Thread.sleep(t*1000);
	} 
	
	public void capture_ss(String f1, String sdir) throws IOException { 
		File sr = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);  //TakesScreenshot is an interface for automation of screenshot. Outputtype is used to store a file
		
		Files.copy(sr, new File(sdir+"/"+f1+".png")); //Filepath
		
	} 
	
	public void scrollDownDemo(int s) {
		((JavascriptExecutor) wd).executeScript("scroll(0,"+s+")");
	}
	
	public void perform_navigate() {
		wd.navigate().back();
	}
	
	public void perform_forward() {
		wd.navigate().forward();
	}
	
	public void reload_page() {
		wd.navigate().refresh();
	}
	
	public void close() {
		if(wd!=null) {
			wd.quit();
		}
	}
	
}
