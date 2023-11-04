package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZooplaPractice {
	
	WebDriver driver;
	
	public void getLogin() {
		DriverManager dm = new DriverManager();
		driver= dm.getDriver(driver);
		driver.navigate().to("https://www.zoopla.co.uk/");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
	//click on AcceptCookies Btn	
		if(mpf.getAcceptCookiesBtn().size()>0) {
			//Explicit wait
		
		//	wait = new WebDriverWait(driver,Duration.ofMillis(10));
			
			
			mpf.getAcceptCookiesBtn().get(0).click();
		
		
			
		}

// click on login
		mpf.getLoginbtn();
		//click on Emailfield
		mpf.getEmailfield();
		//click on password field
		mpf.getPasswordfield();
		//click on LoginBtn2
		mpf.getLoginbtn2();
	}
public static void main(String[] args) {
	ZooplaPractice obj = new ZooplaPractice();
	obj.getLogin();
	
}
}
