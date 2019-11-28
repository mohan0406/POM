package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Crazy1\\Selenium\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,%2Bsnapdeal");
//driver.switchTo().alert().accept();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("(//span[text()=\"Men's Fashion\"])[2]"))).build().perform();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]")).click();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//*[contains(text(),'White Running Shoes')])[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white marR10']")).click();
	}

}
