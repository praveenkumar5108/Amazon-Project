package test;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCls {
	
	WebDriver driver;
	
	By signin = By.linkText("Sign in");
    By username = By.name("email");
    By cont = By.id("continue");
    By passwd = By.name("password");
    By sbmt = By.id("signInSubmit");
    By forgpass = By.linkText("Forgot Password");
    By search1 = By.xpath("//input[@id = 'twotabsearchtextbox']");
    
    
    public AmazonCls(WebDriver driver) {
    	this.driver = driver;
    }
    
    
    public void typeSignin(String uid, String pid) {
    	
    	
    	driver.findElement(signin).click();
    	
    	driver.findElement(username).sendKeys(uid);
    	
    	driver.findElement(cont).click();
    	
    	driver.findElement(passwd).sendKeys(pid);
    	
    	driver.findElement(sbmt).click();
    	
    	driver.findElement(forgpass).click();
    	
    	driver.findElement(username).sendKeys(uid);
    	
    	driver.findElement(cont).click();
        
    	
    }
    
    public void searchP() {
    	
    	driver.findElement(search1).sendKeys("moto" + Keys.ENTER);
        List<WebElement> ele = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
    
        for(WebElement newele : ele) {
        	System.out.println(newele.getText());
        }
    }
    
    
   /* public void typeUserName(){
    	
    	driver.findElement(username).sendKeys("abc@gmail.com");
    	
    }
    
    public void typeContinue() {
    	
    	driver.findElement(cont).click();
    	
    }
    
    public void typePassword() {
    	
    	driver.findElement(passwd).sendKeys("Ram@4321");

    	
    }
    
    public void clickOnSigninButton() {
    	
    	driver.findElement(sbmt).click();
    	
    }
    
    public void typeForgotpass() {
    	driver.findElement(forgpass).click();
    	driver.findElement(username).sendKeys("abc@xyz.com");
    	driver.findElement(cont).click();
    }*/
    
}
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ptupili\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement starth = driver.findElement(By.linkText("Start here."));
		starth.click();
		
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		
		WebElement Username = driver.findElement(By.name("email"));
		Username.sendKeys("abc@gmail.com" + Keys.ENTER);
		
		WebElement passwd = driver.findElement(By.name("password"));
		passwd.sendKeys("Ram@4321" + Keys.ENTER);
		
		driver.findElement(By.linkText("Forgot Password")).click();
		
		Username.sendKeys("abc@gmail.com");
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.submit();
		
		WebElement zipc = driver.findElement(By.id("ap_zip"));
		
		zipc.sendKeys("32324" + Keys.ENTER);*/
		
		
		

	

