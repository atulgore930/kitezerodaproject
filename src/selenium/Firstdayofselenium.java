package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstdayofselenium 
{
public static void main(String[] args) throws InterruptedException {
	//set the path of executable browser driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com");
	//a.navigate().to("https://www.facebook.com");	Thread.sleep(3000);   
	a.navigate().to("https://www.selenium.dev/");
	Thread.sleep(3000);
a.get("https://www.google.com");
Thread.sleep(5000);
a.navigate().back();   
a.navigate().back();   
a.navigate().back();   
a.navigate().forward();
a.navigate().refresh();
a.quit();
a.manage().window().maximize();

	

}
}
