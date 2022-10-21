package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Synchronizationandkeyboardcontrol 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\Admin\\\\Desktop\\\\Atul selenium installation\\\\chromedriver_win32//chromedriver.exe");

	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
		//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	
	WebElement textbox1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	textbox1.sendKeys("my name is atul");
	
	
	Actions act=new Actions (driver);
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	WebElement textbox2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	textbox2.click();
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.perform();
	Thread.sleep(3000);
	
	WebElement compare=driver.findElement(By.xpath("//div[@class='compareButtonText']"));
	compare.click();
	WebElement result=driver.findElement(By.xpath("//span[text()='The two texts are identical!']"));
	String actualresult=result.getText();
	String expectedresult="The two texts are !";
	if(actualresult.equals(expectedresult))
	{
		System.out.println("test case is passed");
	}
	else
	{
		System.out.println("test case is failed");
	}
	
	
	

	for(int i=1;i<=10;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
}}


