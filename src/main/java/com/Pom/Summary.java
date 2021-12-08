package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver c;
	
	@FindBy(xpath = "(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement summary;

	public Summary(WebDriver c2) {
		
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}


	public WebElement getSummary() {
		return summary;
	}
}
