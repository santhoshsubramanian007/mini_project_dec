package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	
	public WebDriver c;
	
	public Confirm(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}


	public WebElement getRadio() {
		return radio;
	}


	public WebElement getCon() {
		return con;
	}


	@FindBy (xpath = "//input[@name = 'radiobutton_0']")
	private WebElement radio;
	

	@FindBy (xpath = "//input[@name = 'continue']")
	private WebElement con;
	

}
