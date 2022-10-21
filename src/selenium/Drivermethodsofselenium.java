package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermethodsofselenium 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().refresh();
	driver.manage().window().minimize();
	driver.close();
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.facebook.com/");
	//driver.manage().window().minimize();
	//driver.quit();
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	System.out.println(driver.getTitle());
	String givenurl="https://www.amazon.com";
	String myurl="https://www.google.com";
	if(givenurl.equals(myurl))
	{
		System.out.println("we landed on current webPage");
		System.out.println("test case is passed");
	}
	else
	{
		System.out.println("test case is failed");
	}
	
	System.out.println("end of program");
	
	
	
	
	
	
}
}
