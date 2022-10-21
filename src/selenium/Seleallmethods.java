package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleallmethods
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32//chromedriver.exe");
     WebDriver driver=new ChromeDriver(); 
	System.out.println("browser is opened");
//	driver.get("https://www.flipkart.com/");
	//System.out.println("flipkart is opened");
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	
//
//	WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//	
//	
//	WebElement userid=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
//	userid.sendKeys("9637107179");
//	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
//    pass.sendKeys("atul1010");
//    
//    WebElement loginbutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//    loginbutton.click();
// 
//	Thread.sleep(5000);
//	WebElement move=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[5]"));
	   Actions act=new Actions(driver);
//		Thread.sleep(5000);
//	act.moveToElement(move).perform();
//	WebElement gaming=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]"));
//	act.moveToElement(gaming).perform();
//     gaming.sendKeys(Keys.ENTER);
  
    JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	js.executeScript("window.scrollBy(0,1000)");   //scroll down
//	Thread.sleep(3000);
//	
//	js.executeScript("window.scrollBy(0,-1000)");  
//	Thread.sleep(3000);
//	WebElement dropDown = driver.findElement(By.xpath("//input[@value='Radio1']"));
	
	WebElement Radiobutton1 =driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/input[1]"));
	js.executeScript("window.scrollBy(0,500)");   //scroll down
	Thread.sleep(3000);
  boolean result	=  Radiobutton1.isSelected();

	Thread.sleep(3000);
    if(result==false)
    {
    	Radiobutton1.click();
    	System.out.println("clicked");
    }
   // act.dr
    

	

}
}
