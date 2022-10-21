package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"\\C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//we need to switch on frame 
		//frame is just like a webElement
		//inspect the iframe
		//switch to iframe
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame2']"));		
		driver.switchTo().frame(iframe);
	
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		
		Select s = new Select(dropDown);
		s.selectByValue("big baby cat");
				
		
		System.out.println("end of program");
		
	}

}


