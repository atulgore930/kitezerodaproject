package normalseleniumprojects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Saucedemologinvalidation 
{
	static WebDriver driver;
	
	public static void screenshotMethod(String screenshotName) throws IOException
	{	
	    
		Date d=new Date();
		
		DateFormat d1 = new SimpleDateFormat("dd-MM-YY& hh-mm-ss");
		
		String date = d1.format(d);
		
	
		TakesScreenshot ts= (TakesScreenshot)driver;
		File seleFile = ts.getScreenshotAs(OutputType.FILE);
		File myFile = new File("E:\\Screenshot\\" + screenshotName+date+ ".jpg");	
		FileHandler.copy(seleFile, myFile);
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Document Object Model
		//DOM
		
		System.setProperty("webdriver.chrome.driver", 
				"\\\\C:\\\\Users\\\\Admin\\\\Desktop\\\\Atul selenium installation\\\\chromedriver_win32\\\\chromedriver.exe");

	driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
       String expectedurl="https://www.saucedemo.com/";
       
       String Actualurl= driver.getCurrentUrl();
       System.out.println(driver.getCurrentUrl());
       
        if(expectedurl.equals(Actualurl))
        {
        	System.out.println("Test case is pass");
        }
        else
        {
        System.out.println("Test case is fail");
        }
		
		//screenshotMethod("LOginPageSS");
		
		
		
		
		
		
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		System.out.println("login button click successfully");
		
	
		
		
	String expectedTitle = "Swag Labs";    //dev/BA
		
		String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
		   
	   }
	   
//	 screenshotMethod("AfterLOgin");
		WebElement menubar = driver.findElement(By.id("react-burger-menu-btn"));
		menubar.click();
		System.out.println("menubar is open");
//		   screenshotMethod("menubar  click");
		   Thread.sleep(3000);
		 
		   
		   WebElement logoutbutton= driver.findElement(By.xpath("//a[text()='Logout']"));
			logoutbutton.click();
			
//			 screenshotMethod("logout successfully");
	
			 String Actualurl1= driver.getCurrentUrl();
		       System.out.println(driver.getCurrentUrl());
		       
		        if(expectedurl.equals(Actualurl1))
		        {
		        	System.out.println("Test case is pass");
		        }
		        else
		        {
		        System.out.println("Test case is fail");
		        }
		
	   
	   

		
		
		
		
	}
}
