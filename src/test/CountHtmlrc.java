package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHtmlrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		int cnt = rows.size();
		System.out.println("no of rows is:" + cnt);
		
		List <WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
  
		int cnt1 = cols.size();
		System.out.println("no of columns :" + cnt1);
				
		WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
		System.out.println(cell.getText());
		
       for(int i=2;i<rows.size();i++) {
            
            WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
            System.out.println(data1.getText());
        }
       
    //   WebElement total = driver.findElement(By.id("customers"));
		
       WebElement ele = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));
       
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", ele);
        }
	}


