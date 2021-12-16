package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public WebDriver c;
	
	public Logout(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getItiner() {
		return itiner;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy (xpath = "(//input[@type = 'button'])[2]")
	private WebElement itiner;

	@FindBy (xpath = "//a[contains (text(), 'Logout')]")
	private WebElement logout;
}
