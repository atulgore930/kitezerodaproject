package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionfinalday 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Atul selenium installation\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("browser is opened");
	//driver.get("https://www.saucedemo.com/");
	driver.get("https://vtctpune.com/");
	System.out.println("site is opened");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Thread.sleep(3000);
	
//	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
//	username.sendKeys("standard_user");
//	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//	password.sendKeys("secret_sauce");
//	
//	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	//loginbutton.click();
//	List<WebElement>addproducts=driver.findElements(By.xpath("//button[text()='Add to cart']"));
//	Thread.sleep(2000);
//	addproducts.get(0);
//	addproducts.get(1);
//	addproducts.get(2);
//	addproducts.get(3);
//	addproducts.get(4); 
//	addproducts.get(5);
//	Thread.sleep(2000);
//	
//	for(int i=0;i<addproducts.size();i++)
//	{
//		addproducts.get(i).click();
//	}
//	System.out.println("end of program");
	
	
	
	
	
	
	WebElement clickbuttonstart=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	clickbuttonstart.click();
	List<String>pageaddress=new ArrayList<String>(driver.getWindowHandles());
	System.out.println("pageaddress"+pageaddress);
	driver.switchTo().window(pageaddress.get(1));
	WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	textBox.sendKeys("Velocity o4th JuneBatch");

	System.out.println("end of program");
//Actions act=new Actions(driver);
//WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//boolean buttonclick=radioButton1.isSelected();
//System.out.println("is element selected??-->"+buttonclick);
//
//if(buttonclick == false)
//{
//	radioButton1.click();
//	boolean result2 = radioButton1.isSelected();   //true
//	System.out.println("is element selected after clicking on it??-->"+result2);
//}
//else
//{
//	System.out.println("Radio button is already selected");
//}


	

	
	

	
	
	
	
	
}
}
