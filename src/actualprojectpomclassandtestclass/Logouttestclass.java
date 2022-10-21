package actualprojectpomclassandtestclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logouttestclass 
{
public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
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
	
	
	
	login.clickbutton();
	Thread.sleep(3000);
	
	//login.loginbutton.click();
	
	//home page 
	Homepagepomclass y=new Homepagepomclass (driver);
	
	y.clickMenubutton();
	
	y.clickLogoutbutton();
	
	System.out.println("apply validation");
	
	String expectedtitle="Swag Labs";
	String actualtitle=driver.getTitle();
	
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("test case is passed for logout");
	}
	else
	{
		System.out.println("test case is failed for logout");
	}
	
	
	
	
	}
}
