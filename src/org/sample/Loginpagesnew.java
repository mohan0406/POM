package org.sample;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Loginpagesnew {

		WebDriver driver;
		
		@FindBy(xpath="//div[@class='responsiveAccountHeader_openAccountPanel']") WebElement account;
		
		@FindBy(xpath="//a[@class='responsiveAccountHeader_accountLogin js-e2e-sign-in']") WebElement signin;
		@FindBy(xpath="//input[@id='username']") WebElement username;
		
		@FindBy(xpath="//input[@id='password']") WebElement password;
		
		@FindBy(xpath="//button[@id='login-submit']") WebElement login;
		 
		public Loginpagesnew(WebDriver driver) {
			this.driver=driver;
		}
		public void homepage(String unm,String pass) throws InterruptedException {
			// TODO Auto-generated method stub
			new Actions(driver).moveToElement(this.account).build().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
signin.click();
username.sendKeys(unm);
password.sendKeys(pass);
login.click();
		}
	}

