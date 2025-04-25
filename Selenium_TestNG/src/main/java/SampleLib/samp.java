package SampleLib;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class samp {
	
	WebDriver wd;
	Scanner sc = new Scanner(System.in);
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://automationexercise.com/");
	}
	
	public void capture_ss(String f1, String sdir) throws IOException {
		File sr = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE); //TakesScreenshot is an interface for automation of screenshot. Outputtype is used to store a file
		
		Files.copy(sr, new File(sdir+"/"+f1+".png")); //Filepath
		
	}
	
	public void scrollDownDemo(int s) {
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		((JavascriptExecutor) wd).executeScript("scroll(0,"+s+")");
	}
	
	public void close() {
		if(wd!=null) {
			wd.quit();
		}
	}
	

}
