package com.lib.pack1test;

import org.testng.annotations.Test;

import com.lib.pack1.HomePage;
import com.lib.pack2.Page2;
import com.lib.pack3.Page3;
import com.lib.util.CommonTestMethods;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver wd ;
	Page3 p2 = new Page3();
	
  @Test(priority = 1)
  public void f() throws IOException, InterruptedException {
	  String s = p2.launchApp();
	  String exp = "We Care About Your Health";
	  assertEquals(exp,s,"hi");
	  
  }
  
  @Test(priority = 2)
  public void f1() throws InterruptedException {
	  p2.login("John Doe","ThisIsNotAPassword");
	  String s = p2.assert_makeappointment();
	  assertEquals("Make Appointment",s,"hi");
  }
  
  @Test(priority = 3)
  public void f2() throws InterruptedException {
	  p2.choose("Hongkong CURA Healthcare Center");
  }
  
  @Test(priority = 4)
  public void f3() throws InterruptedException {
	  p2.click_apply();
  }
  
  @Test(priority = 5)
  public void f4() throws InterruptedException {
	  p2.click_radio();
  }
  
  @Test(priority = 6)
  public void f5() throws InterruptedException {
	  p2.Date("01/12/2000");
  }
  
  @Test(priority = 7)
  public void f6() throws InterruptedException {
	  p2.Bookappo();
  }
  
  
  @BeforeClass
  public void beforeClass() throws IOException {
	  
	  wd = new EdgeDriver();
	  p2.init_launch(wd);
	  
  }
  
  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  String s = p2.confirm_appointment();
	  assertEquals("Appointment Confirmation",s,"hi");
	  p2.ss();
  }

}
