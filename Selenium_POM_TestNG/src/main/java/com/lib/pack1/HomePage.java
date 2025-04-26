package com.lib.pack1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lib.util.CommonTestMethods;

public class HomePage {
	
	protected WebDriver wd;
	
	By wecaretxt = By.xpath("//h3[contains(text(),'We Care About Your Health')]");
	
	protected By makeappoint = By.xpath("//a[@id='btn-make-appointment']");
	
	protected By makeappointtext = By.xpath("//h2[contains(text(),'Make Appointment')]");
	
	protected By facility = By.xpath("//select[@id='combo_facility']");
	
	protected By username = By.xpath("//input[@id='txt-username']");
	
	protected By password = By.xpath("//input[@id='txt-password']");
	
	protected By login = By.xpath("//button[@id='btn-login']");
	
	protected By hosre = By.xpath("//input[@id='chk_hospotal_readmission']");
	
	protected By radio = By.xpath("//input[@id='radio_program_medicaid']");
	
	protected By date = By.xpath("//input[@id='txt_visit_date']");
	
	protected By bookappoint = By.xpath("//button[@id='btn-book-appointment']");
	
	protected By appointconfirm = By.xpath("//h2[contains(text(),'Appointment Confirmation')]");
	
	String path = "./AllConfigs/Properties";
	
	
	protected CommonTestMethods c1 = new CommonTestMethods();
	
	public void init_launch(WebDriver wd) throws IOException {
		this.wd = wd;
		c1.init_common(wd);
		c1.Max_Browser();
	}
	
	public String launchApp() throws IOException, InterruptedException {
		c1.implicit_wait(5);
		return c1.launch(path,wecaretxt);
	}
	

	
	

}
