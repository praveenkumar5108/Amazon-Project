package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eightlcls {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        String baseurl = "http://demo.guru99.com/test/block.html";					
		
		driver.get(baseurl);
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
