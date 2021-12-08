package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver c;
	
	public Shipping(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agree;
	
	@FindBy(xpath = "(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement checkbox;
	

}
