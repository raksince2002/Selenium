package Amazon_testpackage;

import org.testng.annotations.Test;

import Amazon_Defpackage.Amazondef;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Amazontest {
	
	static WebDriver wd;
	static Amazondef a = new Amazondef();
	
  @Test
  public void f() throws InterruptedException {
	  a.launch();
	  a.search("C with Data Structure");
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new EdgeDriver();
	  a.init(wd);
  }

  @AfterClass
  public void afterClass() {
  }

}
