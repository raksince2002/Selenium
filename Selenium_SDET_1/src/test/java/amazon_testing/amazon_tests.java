package amazon_testing;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import amazon_package.amazon_test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class amazon_tests {
	
	static WebDriver wd;
	static amazon_test a = new amazon_test();

	@BeforeClass
	public static void setUp() throws Exception {
		
		wd = new EdgeDriver();
		a.init(wd);
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void launch_test() throws IOException, InterruptedException {
		a.launch();
	}
	
	@Test
	public void search_test() throws IOException, InterruptedException {
		a.search("C with data structure");
	}
	
	@Test
	public void pincode_validate() {
		String[] pin = a.validate().split(" ");
		String pin1 = pin[pin.length-1];
		assertEquals("400017",pin1);
		System.out.println("Validated");
	}
	
	@Test
	public void test_click() {
		a.clicking();
	}
	

}
