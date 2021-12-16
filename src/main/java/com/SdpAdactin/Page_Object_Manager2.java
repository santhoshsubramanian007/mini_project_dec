package com.SdpAdactin;

import org.openqa.selenium.WebDriver;

import com.Adactin_Pom.AdatinPom;
import com.Adactin_Pom.Confirm;
import com.Adactin_Pom.Hotal_Detail;
import com.Adactin_Pom.Logout;
import com.Adactin_Pom.UserDetails;

public class Page_Object_Manager2 {
	
	public WebDriver c;

	private  AdatinPom us;
	
	private  Hotal_Detail hd;
	
	private Confirm cf;
	
	private Logout lg;
	
	private UserDetails ud;
	
	public Page_Object_Manager2(WebDriver c2) {
		
		this.c = c2;
	}


	public  AdatinPom getInstanceus() {
	
		if (us==null) {
			
			us = new AdatinPom(c);
		}
		
		return us;

	}
	
	
	public Hotal_Detail getInstancehd() {
	
		if (hd==null) {
			
			hd = new Hotal_Detail(c);
		}
		
		return hd;

	}
	
	public Confirm getInstancecf() {
		
		if (cf==null) {
			
			cf = new Confirm(c);
		}
		
		return cf;

	}

	public Logout getInstancelg() {
		
		if (lg==null) {
			
			lg = new Logout(c);
		}
		
		return lg;

	}
	
public UserDetails getInstanceud() {
		
		if (ud==null) {
			
			ud = new UserDetails(c);
		}
		
		return ud;

	}

}

 