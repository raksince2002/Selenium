package BigBasket;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bigbasket {
	
	WebDriver wd;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://www.bigbasket.com/");
	}
	
	public void filter() throws InterruptedException {
		wd.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/cl/fruits-vegetables/?nc=nb'])[2]"))).click();
//		wd.findElement(By.id("//a[@href='/cl/fruits-vegetables/?nc=nb']")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("(//button[@pattern='outline'])[1]")).click();
	}

}
