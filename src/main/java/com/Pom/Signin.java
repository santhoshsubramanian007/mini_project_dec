package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	public WebDriver c;
	
	public Signin(WebDriver c2) {
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSign() {
		return sign;
	}

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement mail;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement sign;
	

}
