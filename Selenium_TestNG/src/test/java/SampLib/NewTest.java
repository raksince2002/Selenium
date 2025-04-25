package SampLib;

import org.testng.annotations.Test;

import SampleLib.samp;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver wd;
	samp s = new samp();
  @Test
  public void f() throws IOException {
	  s.scrollDownDemo(7000);
	  s.capture_ss("img2", "Screenshots");
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new EdgeDriver();
	  s.init(wd);
  }

  @AfterClass
  public void afterClass() {
	  s.close();
  }

}
