package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Practice5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is open");
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
	 WebElement userName = driver.findElement(By.id("user-name"));
	 userName.clear();   //clear the data /temp files
	 userName.sendKeys("standard_user");
// 
//		 WebElement password = driver.findElement(By.id("password"));
//		 password.clear();
//		 password.sendKeys("secret_sauce");
//		 
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
//		
//		WebElement bagEle= driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
//		bagEle.click();
//		
//		WebElement basketEle= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		
//		String actualProductSelected =basketEle.getText();  //after execution will get this value
//		System.out.println(actualProductSelected);
//		
//		String expectedProductSelected = "1";   //dev/BA
//		
//		if(expectedProductSelected.equals(actualProductSelected))
//		{
//			System.out.println("TC is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
//		String eleText = loginButton.getText();
//		System.out.println("ele text->"+eleText);
//		
//		String eleAttri= loginButton.getAttribute("id");
//		System.out.println("Attribute value of id is->"+eleAttri);
//		
//		String eleTagName= loginButton.getTagName();
//		System.out.println("tagname of ele->"+eleTagName);
		
//		 WebElement userName = driver.findElement(By.id("user-name"));
//		 userName.clear();   //clear the data /temp files
//		 userName.sendKeys("standard_user");
//
//		 WebElement password = driver.findElement(By.id("password"));
//		 password.clear();
//		 password.sendKeys("secret_sauce");
//		 
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
//		
//		WebElement bagEle= driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
//		bagEle.click();
//		
//		WebElement basketEle= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		
//		String actualProductSelected =basketEle.getText();  //after execution will get this value
//		System.out.println(actualProductSelected);
//		
//		String expectedProductSelected = "1";   //dev/BA
//		
//		if(expectedProductSelected.equals(actualProductSelected))
//		{
//			System.out.println("TC is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("SauceDemo URL is opened");
		
		Thread.sleep(5000);
		
		//hideButton
		//showButton
		//textBox
		
		 WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		 hideButton.click();
		 Thread.sleep(5000);
		 
		 WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		 boolean result1= textBox.isDisplayed();
		 System.out.println("result after clicking on hide button->"+result1);  //false
		 Thread.sleep(5000);
		 
		 WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		 showButton.click();
		 Thread.sleep(5000);
		 
		 boolean result2 = textBox.isDisplayed();
		 System.out.println("result after clicking on show button"+result2);  //true
		 
		 
		 System.out.println("applying the validation");
		 
		 
		 if(result2 ==true)
		 {
			 System.out.println("element is dispayed");
			 textBox.sendKeys("India-Pakistan Match Asia Cup");
		 }
		 else
		 {
			 System.out.println("element is not displayed");
			 showButton.click();
			 textBox.sendKeys("India-Pakistan Match Asia Cup");
			 
		 }
	
	
	}}








