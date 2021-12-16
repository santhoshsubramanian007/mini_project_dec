package com.Base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver c; // -------> null 
	public static Actions act;
	public static JavascriptExecutor js;
	public static String value;


	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			c = new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			c = new FirefoxDriver();
		}
		return c;	
	}

	public static void clickonElement(WebElement element) {

		element.click();

	}
	public static void inputvalue(WebElement element , String value) {

		element.sendKeys(value);
	}
	public static void url(String url) {

		c.get(url);
	}

	public static void close() {

		c.close();
	}
	public static  Actions getaction() {
		act = new Actions(c);
		return act;
	}
	public static void scroll(String type, String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) c;
		
		if (type.equalsIgnoreCase("index")) {
			js.executeScript(value);
		}
		else if (type.equalsIgnoreCase("scrollinto")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
			
		}
	}
	
	public static void implicitlyWait(int num, TimeUnit type) {
		
		c.manage().timeouts().implicitlyWait(num, type);
	}
	
	public static String Data_From_Excel(String path, int row_Index, int cell_Index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
        Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(cell_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

		   value = cell.getStringCellValue();


		}

		else if (cellType.equals(cellType.NUMERIC)) {

			double cellValue = cell.getNumericCellValue();

			int val = (int) cellValue;

            value = String.valueOf(val);  
		}

		return value;

	}
	

	public static void dropdown(WebElement element,String type, String value ) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			s.selectByIndex(num);

		}
		else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		}

	public static void takesnap(String pathname) throws IOException {

		TakesScreenshot shot = (TakesScreenshot) c;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File des = new File(pathname);
		FileHandler.copy(source, des);

	}

}

