package com.amazon.in;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.AmazonCls;

public class VerifyAmazonLogin {
	
	@Test
	public void VerifyLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
        driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		AmazonCls login = new AmazonCls(driver);
		
	
		
		login.typeSignin("abc@xyz.com","Ram@4313");
		
		/*login.typeUserName();
		login.typeContinue();
		login.typePassword();
		login.clickOnSigninButton();
		login.typeForgotpass();*/
		
		driver.navigate().to("https://www.amazon.in/");
		login.searchP();
		
		
		driver.quit();
	}

}
