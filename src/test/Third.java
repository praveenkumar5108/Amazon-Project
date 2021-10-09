package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://demo.guru99.com/test/ajax.html");
	    
	    List<WebElement> elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());
 
	    for(int i = 0; i < elements.size(); i++) {
	    	System.out.println("Radio Button Text:" + elements.get(i).getAttribute("value"));
	    }
	    
	    driver.close();
}
}
