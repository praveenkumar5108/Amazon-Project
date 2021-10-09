package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourteenCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("46546");
		
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		String altmsg = driver.switchTo().alert().getText();
		
		System.out.println("altmsg");
		
		Thread.sleep(10000);
		
		alert.accept();

	}

}
