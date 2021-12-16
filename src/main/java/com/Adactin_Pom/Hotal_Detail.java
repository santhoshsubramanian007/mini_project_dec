package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotal_Detail {
	
	public WebDriver c;
	
	@FindBy(xpath = "//select[@name = 'location']")
	private WebElement location;
	
	@FindBy (xpath = "//select[@name = 'hotels']")
	private WebElement hotel;
	
	@FindBy (xpath = "//select[@name = 'room_type']")
	private WebElement roomtype;
	
	@FindBy (xpath ="//select[@name = 'room_nos']")
	private WebElement roomno;
	
	@FindBy (xpath = "//select[@name = 'adult_room']")
	private WebElement adultroom;
	
	@FindBy (xpath = "//select[@name = 'child_room']")
	private WebElement childroom;
	
	@FindBy (xpath = "//input[@type = 'submit']")
	private WebElement sumbit;
	

	
	public Hotal_Detail(WebDriver c2) {
		this.c = c2;
		
		PageFactory.initElements(c, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSumbit() {
		return sumbit;
	}

	
}
