package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventhCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String baseurl = "http://demo.guru99.com/test/link.html";
		
		driver.get(baseurl);
		
		driver.findElement(By.partialLinkText("here")).click();
		
		//driver.findElement(By.linkText("click here")).click();
		
		System.out.println("title of the page:" + driver.getTitle());
		
		driver.quit();                                                                                                                                                                                                                                                                                                                                                                                                                      
		
		
		
		
	}

}
