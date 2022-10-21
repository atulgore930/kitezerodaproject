package exceldatatransfer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceltoeclipsedatatransfer
{
public static void main(String[] args) throws IOException 
{
	
	
		//file address
		String path = "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\excel apache poi\\saucedemoexcelfile\\saucedemo.xlsx";
		
		//file open -read
	FileInputStream file = new FileInputStream(path);  //exception1
		
		//workbook read	
		XSSFWorkbook wb = new XSSFWorkbook(file);  
		String result=wb.getSheet("aa").getRow(0).getCell(0).getStringCellValue();//exception
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//login
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//sheet read
		//XSSFSheet sht = wb.getSheet("aa");
		
		//row read
		//XSSFRow rw = sht.getRow(1);  //row0
		
		
		//cell read
		//XSSFCell cl = rw.getCell(0);      //cell0
		
		//data read
		//String result = cl.getStringCellValue();
		
		
		//String result=wb.getSheet("aa").getRow(3).getCell(1).getStringCellValue();
		//	System.out.println(result);
		
}
}
