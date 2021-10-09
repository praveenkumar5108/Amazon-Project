package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expected = "Welcome: Mercury Tours";
		String actual = "";
		
		driver.get(baseUrl);
		
		actual = driver.getTitle();
		
		if(actual.contentEquals(expected)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.quit();
		
		
	}

}
