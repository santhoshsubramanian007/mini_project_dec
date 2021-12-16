package com.Runner;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Adactin_Pom.AdatinPom;
import com.Adactin_Pom.Confirm;
import com.Adactin_Pom.Hotal_Detail;
import com.Adactin_Pom.Logout;
import com.Adactin_Pom.UserDetails;
import com.Base_Class.Baseclass;
import com.SdpAdactin.Page_Object_Manager2;

public class Adactin extends Baseclass {

	public static WebDriver c = getBrowser("chrome");

	public static  Page_Object_Manager2 pom2 = new Page_Object_Manager2(c);

	public static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Adactin.class);


	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		log.error("Browser Launch");
		url("http://adactinhotelapp.com/");
		log.info("url Launch");
		String username = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 1, 5);
		inputvalue(pom2.getInstanceus().getUsername(),username);
		String password = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 2, 5);
		inputvalue(pom2.getInstanceus().getPassword(), password);
		clickonElement(pom2.getInstanceus().getLogin());
		log.info("sign in succesfully");
		String location = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 4, 5);
		dropdown(pom2.getInstancehd().getLocation(), "text", location);
		String Hotels = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 5, 5);
		dropdown(pom2.getInstancehd().getHotel(), "text", Hotels);
		dropdown(pom2.getInstancehd().getRoomtype(), "index", "1");
		dropdown(pom2.getInstancehd().getRoomno(), "index", "2");
		dropdown(pom2.getInstancehd().getAdultroom(), "index", "2");
		dropdown(pom2.getInstancehd().getChildroom(), "index", "2");
		clickonElement(pom2.getInstancehd().getSumbit());
		log.info("Hotel selected succesfully");
		clickonElement(pom2.getInstancecf().getRadio());
		clickonElement(pom2.getInstancecf().getCon());
		String firstname = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 15, 5);
		inputvalue(pom2.getInstanceud().getFirstname(), firstname);
		String lastname = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 16, 5);
		inputvalue(pom2.getInstanceud().getLastname(), lastname);
		String address = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 17, 5);
		inputvalue(pom2.getInstanceud().getAddress(), address);
		String creditno = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 18, 5);
		inputvalue(pom2.getInstanceud().getCardno(), creditno);
		dropdown(pom2.getInstanceud().getCreditcard(), "index", "2");
		dropdown(pom2.getInstanceud().getExpdate(), "index", "10");
		dropdown(pom2.getInstanceud().getExpyear(), "index", "10");
		String cvvno = Data_From_Excel("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Test-Case Adactin.xlsx", 22, 5);
		inputvalue(pom2.getInstanceud().getCvv(), cvvno);
		clickonElement(pom2.getInstanceud().getBook());
		log.info("personal details Enter succesfully");
		clickonElement(pom2.getInstancelg().getItiner());
		clickonElement(pom2.getInstancelg().getLogout());
		log.info("Logout succesfully");
	}
}
