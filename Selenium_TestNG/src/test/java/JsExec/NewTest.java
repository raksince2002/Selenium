package JsExec;

import org.testng.annotations.Test;

import JSExec.JSExecutorDemo;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static JSExecutorDemo j = new JSExecutorDemo();
	
  @Test
  public void f() throws InterruptedException {
	  j.demo();
	  Reporter.log("Test completed"); //Share message to TestNG report
  }
  
  @Test(groups="smoke")
  public void m1() {
	  System.out.println("test1");
  }
  
  @Test(groups="smoke")
  public void m2() {
	  System.out.println("test2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  wd = new EdgeDriver();
	  j.init(wd);
  }

  @AfterClass
  public void afterClass() {
  }

}
