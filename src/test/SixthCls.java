package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String baseurl  = "https://www.simplilearn.com/";
		
		driver.get(baseurl);

		driver.findElement(By.cssSelector("a[title=\"Simplilearn - Online Certification Training Course Provider\"]"));
		
		if(driver.getTitle().equals("")) {
			System.out.println("we are in simplilear page");
		}else {
			System.out.println("we are not in the simplilearn page");
		}
		
		driver.close();

	}

}
