package Selenium_SDET.Selenium_SDET_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lib.day1.Sel;

import junit.framework.Assert;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class google_webtest {
	
	static Sel s = new Sel();
	static WebDriver wd;
	
	@BeforeClass
	public static void a() throws InterruptedException {
		wd = new ChromeDriver();
		s.init_Web(wd);
		s.maximize();
	}

	
	@Test
	public void b() throws InterruptedException {
		String title = s.title_display();
		assertEquals("Google",title);
		System.out.println(title);
		
	}
	
	@Test
	public void c() throws InterruptedException {
		s.extract_PageSource();
	}
	
	
	@Test
	public void d() throws InterruptedException {
		String current = s.find();
		String expected = "https://www.google.com/imghp?hl=en&ogbl";
		assertEquals(expected, current);
	}
	
	@Test
	public void e() throws InterruptedException {
		String current = s.navigate_demo();
		String expected = "https://www.google.com/imghp?hl=en&ogbl";
		assertEquals(expected, current);
	}
	
	@AfterClass
	public static void f() {
		s.close();
	}
	
	

}
