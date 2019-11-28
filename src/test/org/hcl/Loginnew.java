package test.org.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.sample.Loginpagesnew;

public class Loginnew {

public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Crazy1\\Selenium\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.skinstore.com/");


Loginpagesnew lognew = PageFactory.initElements(driver, Loginpagesnew.class);

lognew.homepage("mohanraj1996aa@gmail.com", "978788077");

}
}
