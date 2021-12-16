package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdatinPom {
	
	public WebDriver c;
	
	@FindBy(xpath = "//input[@id = 'username']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type = 'password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@type = 'Submit']")
	private WebElement login;
	
	public AdatinPom(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	

}
