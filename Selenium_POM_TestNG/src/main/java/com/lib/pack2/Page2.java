package com.lib.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.lib.pack1.HomePage;

public class Page2 extends HomePage{
	
	public void login(String i, String j) throws InterruptedException {
		c1.implicit_wait(5);
		wd.findElement(makeappoint).click();
		wd.findElement(username).sendKeys(i);
		wd.findElement(password).sendKeys(j);
		wd.findElement(login).click();
	}
	
	public String assert_makeappointment() {
		return wd.findElement(makeappoint).getText();
	}
	
	public void choose(String s) throws InterruptedException {
		c1.implicit_wait(5);
		WebElement we = wd.findElement(facility);
		Select s1 = new Select(we);
		s1.selectByVisibleText(s);
	}
	
	public void click_apply() throws InterruptedException {
		c1.implicit_wait(5);
		wd.findElement(hosre).click();
	}
	
	public void click_radio() throws InterruptedException {
		c1.implicit_wait(5);
		wd.findElement(radio).click();
	}
	
	public void Date(String s) throws InterruptedException {
		c1.implicit_wait(5);
		wd.findElement(date).sendKeys(s);
	}
	
	public void Bookappo() throws InterruptedException {
		c1.implicit_wait(5);
		wd.findElement(bookappoint).click();
	}

}
