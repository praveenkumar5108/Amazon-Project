package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EghtCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement basel = driver.findElement(By.tagName("table"));
		
		WebElement rowTbl = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		
		String r_text = rowTbl.getText();
		
		System.out.println("Third row of this table is:" + r_text);
		
		WebElement ce = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[3]"));
		String ce_text = ce.getText();
		System.out.println("The column name is " + ce_text);
		
		driver.close();

	}

}
