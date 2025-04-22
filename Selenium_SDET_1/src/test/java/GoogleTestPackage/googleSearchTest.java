package GoogleTestPackage;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Google_Package.googleSearch;

public class googleSearchTest {
	
	static WebDriver wd;
	static googleSearch g = new googleSearch();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		wd = new ChromeDriver();
		g.init(wd);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void search() throws InterruptedException {
		System.out.println(g.search("Test automation"));
		
	}
	
	

}
