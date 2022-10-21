package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");

	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	
//	driver.get("https://www.facebook.com/");
//	WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
//	username.sendKeys("umakant.padwal");
//	WebElement pwd= driver.findElement(By.xpath("//input[@id='pass']"));
//pwd.sendKeys("953659820");
//WebElement logb= driver.findElement(By.xpath("//button[@name='login']"));
//logb.click();

//	driver.get("https://kite.zerodha.com/");
//	WebElement username=driver.findElement(By.id("userid"));
//	 username.sendKeys("QVR625");
//		WebElement pass=driver.findElement(By.id("password"));
//		 pass.sendKeys("atul10@10");
//		 WebElement logbutt=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
//		logbutt.click();
//		 

	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.xpath("//a[@class='gb_d']"));
	search.click();
	
	WebElement sign=driver.findElement(By.partialLinkText("Sign in"));
 sign.click();
	WebElement gmailog=driver.findElement(By.xpath("//input[@id='identifierId']"));
	gmailog.sendKeys("atulgore930@gmail.com");
	
	WebElement nextclick1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	 nextclick1.click();
	
	 WebElement pass=driver.findElement(By.xpath("//input[@name=password']"));
	 pass.sendKeys("atul");
	

			//("//input[@id='user-name']"));
	 
}
}
