package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver c ;
	
	@FindBy(xpath = "(//img[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement shirts;

	public Home_Page(WebDriver c2) {
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getShirts() {
		return shirts;
	}
	
	
	
	

}
