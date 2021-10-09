package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.firefox.driver","firefoxdriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();  

		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		

		WebElement CreateAcc = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		CreateAcc.click();
		
		WebElement Firstname = driver.findElement(By.cssSelector("input[name=firstname]"));
        Firstname.sendKeys("praveen");
		
		//WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dday = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		//dday.deselectByVisibleText("14");
		dday.selectByIndex(2);
		//dday.selectByValue(arg0);
		
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
				
		month.selectByIndex(3);
		
		
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));

		year.selectByIndex(3);
		
		WebElement FEMale = driver.findElement(By.xpath("//input[@type = 'radio' and @value='1']"));
		FEMale.click();
		if(FEMale.isSelected()) {
			System.out.println("radio button selected");
		}else {
			System.out.println("radio button is not selected");
		}
		
     List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
        
        for(int i=1;i<=Months.size();i++) {
            
            WebElement data = driver.findElement(By.xpath("//select[@id='month']/option[" + i + "]"));
            System.out.println(data.getText());
        	
        	//System.out.println(Months.get(i).getText());
        }
		
	}
	
	

	

}
