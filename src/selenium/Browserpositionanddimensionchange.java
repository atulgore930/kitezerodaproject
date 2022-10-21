package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserpositionanddimensionchange
{
	
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Desktop\\Testing practice\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	

	
	//browser size setting
	                         // L  , W
	Dimension d = new Dimension(1000,1000);
	
	driver.manage().window().setSize(d);
	
	
    //browser position change
    
	Point p = new Point(800,300);
	
	driver.manage().window().setPosition(p);
	
	System.out.println("Browser is opened");
	
	String  givenURL = "https://www.facebook.com/";   //given data->dev/BA
	String actualURLl="https://www.facebook.com/";
	driver.get(givenURL);   
	System.out.println("url is opened");
	
	//login page of facebook
	
	String actualURL = driver.getCurrentUrl();  //actual data
	System.out.println(actualURL);//str
	
	if(givenURL.equals(actualURLl))
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

	
		
	


