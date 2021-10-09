package test;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String mainwindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
        Iterator<String> i1=s1.iterator();	

        while(i1.hasNext()) {
        	String childwin = i1.next();
        	if(!mainwindow.equalsIgnoreCase(childwin)) {
        		driver.switchTo().window(childwin);
        		driver.findElement(By.name("emailid")).sendKeys("fjhdfjd@gmail.com");
        		driver.findElement(By.name("btnLogin")).click();
        		driver.close();
        	}
        }

        driver.switchTo().window(mainwindow);

	}

}
