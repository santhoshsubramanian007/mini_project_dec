package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	
	public WebDriver c;
	
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addcart;

	public Add_Cart(WebDriver c2) {
	
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getAddcart() {
		return addcart;
	}

}

