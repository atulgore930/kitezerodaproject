package actualprojectpomclassandtestclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass 
{
 //1.webdriver declare
	private WebDriver driver;
	
	//2.element find
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	//3.create a method as per action on ele
	//and action in that method
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	//2.element find
	@FindBy(xpath="//input[@id='password']")
	private  WebElement password;
	
	//3.create a method as per action on ele
	//and action in that method
	
	public  void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	

	
	//2.element find
	@FindBy(xpath="//input[@id='user-name']")
	private static WebElement loginbutton;
	
	//3.create a method as per action on ele
	//and action in that method
	
	public void clickbutton()
	{
		loginbutton.click();
	}
	
	
	
	
	//4.create constructor
	public Loginpomclass (WebDriver driver)
	{
		//global
		this.driver=driver;
		
		//sele class
		PageFactory.initElements(driver,this);
	}
	
}
