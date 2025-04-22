package automation_test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import automation_package.automation_defintion;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class automationTest {
	
	static WebDriver wd;
	static automation_defintion a = new automation_defintion();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		wd = new EdgeDriver();
		a.init(wd);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

//	@Test
//	public void test() {
//		String s = a.textcart_validate();
//		assertEquals("Cart",s);
//		System.out.println("Success");
//	}
	
	@Test
	public void credentials_test() {
		a.credentials("rakesh@gmail.com", "Rocky@20209203948394");
	}
	
	@Test
	public void login_test() {
		a.login();
	}
	
	@Test
	public void validate_errormessage() {
		assertEquals("Your email or password is incorrect!",a.error_message());
		System.out.println("Success");
	}

}
