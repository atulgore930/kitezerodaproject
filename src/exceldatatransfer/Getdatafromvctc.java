package exceldatatransfer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdatafromvctc 
{
public static void main(String[] args) throws IndexOutOfBoundsException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("browser is open");
	driver.manage().window().maximize();
	System.out.println("window is maximized");
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("vctc URL is opened");
	List<WebElement> tHeaders= driver.findElements(By.xpath("//table//tbody//tr//th"));
	System.out.println(tHeaders.size());
	for(int i=0;i<tHeaders.size();i++)
	{
		System.out.print(tHeaders.get(i).getText());
		System.out.print("   ");
	}
	List<WebElement>tallcells=driver.findElements(By.xpath("//table//tbody//tr//td"));
	System.out.println();
	for(int j=0;j<tallcells.size();j++)
	{
		System.out.println(tallcells.get(j).getText());
	}
	
}
}
