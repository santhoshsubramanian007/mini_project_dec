package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	public WebDriver c;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement out;

	public Address(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getOut() {
		return out;
	}

}
