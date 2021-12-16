package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetails {
	
	public WebDriver c;
	
	@FindBy (xpath = "//input[@name = 'first_name']")
	private WebElement firstname;
	
	public UserDetails(WebDriver c2) {
		
		this.c = c2;
		PageFactory.initElements(c, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getExpdate() {
		return expdate;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy (xpath = "//input[@name = 'last_name']")
	private WebElement lastname;

    @FindBy (xpath = "//textarea[@name = 'address']")
	private WebElement address;

	@FindBy (xpath = "//input[@name = 'cc_num']")
	private WebElement cardno;

	@FindBy (xpath = "//select[@name = 'cc_type']")
	private WebElement creditcard;

	@FindBy (xpath = "//select[@name = 'cc_exp_month']")
	private WebElement expdate;

	@FindBy (xpath = "//select[@name = 'cc_exp_year']")
	private WebElement expyear;
	
	@FindBy (xpath = "//input[@name = 'cc_cvv']")
	private WebElement cvv;
	
	@FindBy (xpath = "(//input[@type = 'button'])[1]")
	private WebElement book;


}
