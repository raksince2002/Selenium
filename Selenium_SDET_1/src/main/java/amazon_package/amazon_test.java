package amazon_package;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazon_test {
	
	WebDriver wd;
	String fp = "C:\\Users\\rakesh.sd\\eclipse-workspace\\Selenium_SDET_1\\Allconfigs\\Properties";
	
	Properties p = new Properties();
	
	public void init(WebDriver wd) {
		this.wd = wd;
	}
	
	public void launch() throws IOException, InterruptedException {
		
		FileReader fr = new FileReader(fp);
		
		p.load(fr);
		
		Thread.sleep(2000);
		wd.get(p.getProperty("BaseUrl"));
		
	}
	
	public void search(String inp) throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(inp);
		 
		Thread.sleep(2000);
		
	}
	
	public void clicking() {
		wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
	public String validate() {
		
		String t = wd.findElement(By.xpath("//*[@id='glow-ingress-line1']")).getText();
		return t;
	}
	
}
