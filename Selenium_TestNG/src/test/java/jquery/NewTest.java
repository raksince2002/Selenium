package jquery;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static Jquery j = new Jquery();
	
  @Test
  public void f() throws InterruptedException {
	  j.dropframe();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new ChromeDriver();
	  j.init(wd);
	  wd.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  j.close();
  }

}
