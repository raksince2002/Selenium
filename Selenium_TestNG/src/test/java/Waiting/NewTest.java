package Waiting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static WaitingDemo i = new WaitingDemo();
  @Test
  public void f() {
	  i.wait_implicit();
  }
  @BeforeClass
  public void beforeClass() {
	  
	  wd = new EdgeDriver();
	  i.init(wd);
	  wd.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
