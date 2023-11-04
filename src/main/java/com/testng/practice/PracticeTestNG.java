package com.testng.practice;

import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@Test(priority=0, groups= {"Smoke"})
	public void login() {
		System.out.println("This is login method.");
	}
	@Test(priority=1, groups= {"Regression","Smoke"},dependsOnMethods="login")
	public void dress() {
		System.out.println("This is dress method.");
	}
	@Test(priority=2, groups= {"Smoke"})
	public void cart() {
		System.out.println("This is cart method.");
	}
	@Test(priority=3, enabled=false)
	public void payment() {
		System.out.println("This is payment method.");
	}
	@Test
	public void placeOrder() {
		System.out.println("This is placeOrder method.");
	}

}
