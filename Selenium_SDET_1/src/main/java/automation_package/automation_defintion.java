package automation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_defintion {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://automationexercise.com/");
		wd.findElement(By.xpath("//a[@href='/login']")).click();
	}
	
	public String textcart_validate() {
		String text = wd.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).getText();
		return text;
	}
	
	public void credentials(String email, String password) {
		
		wd.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(email);
		wd.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	}
	
	public void login() {
		wd.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String error_message() {
		String error = wd.findElement(By.xpath("//p[@style='color: red;']")).getText();
//		String str = error.getText();
		return error;
	}
	
}
