package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwelveCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement upl = driver.findElement(By.name("uploadfile_0"));
		upl.sendKeys("C:\\Users\\ptupili\\eclipse-workspace\\UnitTesting\\src\\unit\\Ntest.java");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
