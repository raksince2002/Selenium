package BigBasket;

import org.testng.annotations.Test;

//import Bookmyshow.BookMyShow;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd;
	static Bigbasket b = new Bigbasket();
	
  @Test
  public void f() throws InterruptedException {
	  b.filter();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new EdgeDriver();
	  b.init(wd);
  }

  @AfterClass
  public void afterClass() {
  }

}
