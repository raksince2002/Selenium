package webscap;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static webScrap w = new webScrap();
	
  @Test
  public void f() {
	  w.get_table();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new ChromeDriver();
	  w.init(wd);
  }

  @AfterClass
  public void afterClass() {
  }

}
