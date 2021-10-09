package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElevenCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		WebElement textUser = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		
		Action ser = builder.moveToElement(textUser).click().keyDown(textUser, Keys.SHIFT).sendKeys(textUser,"hello").keyUp(textUser,Keys.SHIFT).doubleClick(textUser).contextClick().build();
		ser.perform();
		
		//driver.close();

	}

}
