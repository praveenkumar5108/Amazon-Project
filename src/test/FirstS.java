package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		
		String baseurl = "https://twitter.com/";
		String tagName = "";
		
		driver.get(baseurl);
		
		WebElement Log_Log = driver.findElement(By.linkText("Sign in"));
		Log_Log.click();
		
		WebElement log_em = driver.findElement(By.name("identifier"));
		log_em.sendKeys("abc@xyz.com"+ Keys.ENTER);
		
		WebElement log_pas = driver.findElement(By.name("password"));
		log_pas.sendKeys("Abc@31221" + Keys.ENTER);
		
		

		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}
