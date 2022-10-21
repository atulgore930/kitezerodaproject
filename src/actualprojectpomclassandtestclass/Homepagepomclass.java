package actualprojectpomclassandtestclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagepomclass 
{
WebDriver driver;


@FindBy(xpath="//button[@id='react-burger-menu-btn']")

WebElement menubutton;


public void clickMenubutton()
{
	menubutton.click();
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")

WebElement clicklogoutbutton;


	public void clickLogoutbutton()
	{
		clicklogoutbutton.click();
	}
	
	
	
	public Homepagepomclass (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

}
