package dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver wd ;
	static dropDownDemo d = new dropDownDemo();
	
  @Test(priority = 1)
  public void selectopt() throws InterruptedException {
	  d.select();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new ChromeDriver();
	  d.init(wd);
  }
  
  @Test(priority=2)
  public void returnlist() {
//	  System.out.println(d.listoptions());
	  List<WebElement> l = d.listoptions();
	  List<String> l1 = new ArrayList<String>();
	  for(WebElement i : l) {
		  l1.add(i.getText());
	  }
	  assertTrue(l1.contains("Amazon Devices"));
	  System.out.println(d.countofImages());
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
