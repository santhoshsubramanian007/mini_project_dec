package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.Add_Cart;
import com.Pom.Address;
import com.Pom.Checkout;
import com.Pom.Home_Page;
import com.Pom.Shipping;
import com.Pom.Signin;
import com.Pom.Summary;

public class Page_Object_Manager {

	private WebDriver c;

	private Home_Page hp;

	private Add_Cart addcart;

	private Checkout checkout1;

	private Summary sum;

	private Signin sign;

	private Address out;

	private Shipping sh;

	public Page_Object_Manager(WebDriver c2) {

		this.c = c2;
	}

	public  Home_Page getInstancehp() {

		if (hp==null) {

			hp = new Home_Page(c);

		}
		return hp;
	}

	public  Add_Cart getInstanceaddcart() {

		if (addcart==null) {

			addcart = new Add_Cart(c);

		}
		return addcart;
	}

	public  Checkout getInstancecheckout1() {

		if (checkout1==null) {

			checkout1 = new Checkout(c);

		}
		return checkout1;
	}

	public Summary getInstancesum() {

		if ( sum==null) {

			sum = new Summary(c);

		}
		return  sum;

	}
	public Signin getInstancesign() {

		if (sign==null) {

			sign = new Signin(c);

		}
		return sign;
	}
	public  Address getInstanceout() {

		if (out==null) {

			out = new Address(c);

		}
		return out;
	}
	public  Shipping getInstancesh() {

		if (sh==null) {

			sh = new Shipping(c);

		}
		return sh;
	}
}
