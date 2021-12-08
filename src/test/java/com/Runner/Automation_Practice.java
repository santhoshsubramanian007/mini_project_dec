package com.Runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.Base_Class.Baseclass;
import com.Pom.Add_Cart;
import com.Pom.Address;
import com.Pom.Checkout;
import com.Pom.Home_Page;
import com.Pom.Shipping;
import com.Pom.Signin;
import com.Pom.Summary;
import com.Sdp.Page_Object_Manager;

public class Automation_Practice extends Baseclass {

	public static WebDriver c = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(c);

	public static void main(String[] args) throws Throwable {
		url("http://automationpractice.com/index.php");



		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickonElement(pom.getInstancehp().getShirts());

		JavascriptExecutor js = (JavascriptExecutor)c;
		js.executeScript("window.scrollBy(0,300);","");

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickonElement(pom.getInstanceaddcart().getAddcart());



		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickonElement(pom.getInstancecheckout1().getCheckout1());

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		clickonElement(pom.getInstancesum().getSummary());


		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		inputvalue(pom.getInstancesign().getMail(), "sansmech30@gmail.com");

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		inputvalue(pom.getInstancesign().getPass(), "manisans@007");

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickonElement(pom.getInstancesign().getSign());

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		clickonElement(pom.getInstanceout().getOut());

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		clickonElement(pom.getInstancesh().getAgree());

		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickonElement(pom.getInstancesh().getCheckbox());

		js.executeScript("window.scrollBy(0,300);","");
		
		takesnap("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\snapshots\\img.png");

	}


}		


