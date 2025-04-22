package AwesomeQA_test;

import org.testng.annotations.Test;

import AwesomeQA_def.AwesomeQA;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class qatest {
	
	static WebDriver wd;
	static AwesomeQA a = new AwesomeQA();
	
  @Test
  public void f() {
	  
	  boolean enabled = a.radio();
	  
//	  assertTrue("true",enabled);
	  
	  Assert.assertTrue(enabled);
	  
	  System.out.println("Success");
	  
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
