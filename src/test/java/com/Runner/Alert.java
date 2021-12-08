package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh\\eclipse-workspace\\Selenium_Java\\Driver\\chromedriver.exe");
	
	WebDriver c = new ChromeDriver();
	c.get("https://demoqa.com/alerts");
	c.manage().window().maximize();
	
	WebElement input1 = c.findElement(By.xpath("//button[@id='alertButton']"));
	input1.click();
	
	Thread.sleep(3000);
	c.switchTo().alert().accept();
	
	WebElement input2 = c.findElement(By.xpath("//button[@id='confirmButton']"));
	input2.click();
	
	Thread.sleep(3000);
	c.switchTo().alert().dismiss();
	
	WebElement input3 = c.findElement(By.xpath("//button[@id='promtButton']"));
	input3.click();
	Thread.sleep(3000);
	 org.openqa.selenium.Alert alert2 = c.switchTo().alert();
	 alert2.sendKeys("running sucessfully");
	 alert2.accept();
	}
}
