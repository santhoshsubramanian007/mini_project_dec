package com.Base_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	
	public static WebDriver c; // -------> null 
	public static Actions act;
	public static JavascriptExecutor js;
	
	
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
	public static JavascriptExecutor Executor() {
		js = (JavascriptExecutor) c;
		return js;
	}
	
	public static void takesnap(String pathname) throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) c;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File des = new File(pathname);
		FileHandler.copy(source, des);
		
	}
	
}

