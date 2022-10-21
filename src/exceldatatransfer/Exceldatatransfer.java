package exceldatatransfer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatatransfer 
{
	public static void main(String[] args) throws IOException 
	{
		//file address
		String path = "C:\\Users\\Admin\\Desktop\\Atul selenium installation\\excel apache poi\\saucedemoexcelfile\\saucedemo.xlsx";
		
		//file open -read
		FileInputStream file = new FileInputStream(path);  //exception1
		
		//workbook read	
		XSSFWorkbook wb = new XSSFWorkbook(file);          //exception 2
		
		//sheet read
		XSSFSheet sht = wb.getSheet("aa");
		
		

		String result=wb.getSheet("aa").getRow(0).getCell(0).getStringCellValue();
		
		
		System.out.println(result);
		

		
		
	}



}

