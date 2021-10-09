package test;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TenthCls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		 WebElement link_Home = driver.findElement(By.linkText("Home"));
         WebElement td_Home = driver
                 .findElement(By
                 .xpath("//html/body/div"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr"));    
          
         Actions builder = new Actions(driver);
         org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(link_Home).build();
          
         String bgColor = td_Home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
         mouseOverHome.perform();        
         bgColor = td_Home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);
         
         Thread.sleep(1000);
         
         driver.close();
	}

}
