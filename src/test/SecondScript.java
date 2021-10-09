package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
       driver.switchTo().frame("classFrame");
        
        driver.findElement(By.linkText("Deprecated")).click();
        
        Thread.sleep(3000);
        
        driver.close(); 
		
		
	}

}
