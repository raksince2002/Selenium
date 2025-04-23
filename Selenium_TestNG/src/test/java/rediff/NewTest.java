package rediff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static Rediff r = new Rediff();
	
  @Test
  public void f() throws InterruptedException {
	  r.alert();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new ChromeDriver();
	  r.init(wd);
	  wd.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  r.close();
  }

}
