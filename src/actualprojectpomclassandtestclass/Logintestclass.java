package actualprojectpomclassandtestclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintestclass 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	System.out.println("browser is open");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	System.out.println("window maximized");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("url is opened");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Loginpomclass login=new Loginpomclass (driver);
	login.sendusername();
	login.sendpassword();
	System.out.println("username is entered");
	
	login.clickbutton();
	System.out.println("password is entered");
	
	
	
	

	
	System.out.println("apply validation");
	
	
	String actualtitle=driver.getTitle();
	String expectedtitle="Swag Labs";
	
	
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("login test case is passed");
	}
	else
	{
		System.out.println("login test case failed");
	}
	
	driver.quit();
	System.out.println("end of program");
	
	
	
	
	
	
}
}
