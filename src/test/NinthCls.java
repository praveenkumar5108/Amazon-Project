package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NinthCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		drpCountry.selectByVisibleText("ANTARCTICA");	
		
		//selecting multiple elements
		
		driver.get("http://jsbin.com/osebed/2");

		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		fruits.selectByVisibleText("Banana");
		
		fruits.selectByIndex(1);
		
		driver.close();

	}

}
