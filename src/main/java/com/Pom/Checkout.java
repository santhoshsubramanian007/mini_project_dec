package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	public WebDriver c;
	
	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement checkout1;

	public Checkout(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getCheckout1() {
		return checkout1;
	}
	

}
