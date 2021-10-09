package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		System.out.println("Radio Button oprion1 is selected");
		
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		System.out.println("Radio Button option2 is selected");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		
		if(option1.isSelected()) {
			System.out.println("Checkbox is toggled on");
		}else {
			System.out.println("Checkbox is toggled off");
		}
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		WebElement chFB = driver.findElement(By.id("persist_box"));
		
		for(int i =0; i<2; i++) {
			chFB.click();
			System.out.println("FB persist checkbox status is:" + chFB.isSelected());
		}
		
		
		driver.close();
		
		

		
	}

}
