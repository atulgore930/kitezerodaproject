package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is open");
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.get("https://www.facebook.com/");
		driver.get("faccebook is opened");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("atulgore930@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
		
		//we cant select the options in dropdown
		//with the help of webelement/webdriver interface methods
		
		//selenium class
		//in const-always pass a dropdown element
		
	

	}
}
