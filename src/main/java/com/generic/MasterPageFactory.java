package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) { 
		PageFactory.initElements( driver,this);// handle the NullPointerException
	}
	@FindBy(xpath="(//*[contains(text(), ' Signup / Login')]")
	private WebElement loginbtn;
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailfield;
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwordfield;
	@FindBy(xpath="//button[contains(text(), 'Login' )]")
	private WebElement loginbtn2;
	@FindBy(xpath="//*[contains(text(), 'Logout') ]")
	private WebElement logoutbtn;
	@FindBy(xpath="//div[contains(text(),  'Oslo') and @id ='box1']")
	private WebElement dragOslo;
	@FindBy(xpath="//div[contains(text(),'Washington')and @id='box3']")
	private WebElement washington;
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement unitedStates;
	
	//Zoopla
	@FindBy(xpath="//button[@class='_1erwn750 1erwn751 1erwn752 1erwn75a 1dgm2fc8']")
	private WebElement zooplaLoginBtn2;
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement zooplaPassword;
	@FindBy(xpath="//input[@id='email']")
	private WebElement zooplaEmail; 
	@FindBy(xpath="(//span[contains(text(), 'Sign in')])[2]")
	private WebElement zooplaLoginBtn;
	
	public WebElement getZooplaLoginBtn2() {
		return zooplaLoginBtn2;
	}


	public WebElement getZooplaPassword() {
		return zooplaPassword;
	}


	public WebElement getZooplaEmail() {
		return zooplaEmail;
	}
	@FindBy(xpath="//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> AcceptCookiesBtn;	 




	public WebElement getZooplaLoginBtn() {
		return zooplaLoginBtn;
	}


	public List<WebElement> getAcceptCookiesBtn() {
		return AcceptCookiesBtn;
	}


	public WebElement getWashington() {
		return washington;
	}


	public WebElement getUnitedStates() {
		return unitedStates;
	}


	public WebElement getDragOslo() {
		return dragOslo;
	}


	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	public WebElement getEmailfield() {
		return emailfield;
	}


	public WebElement getPasswordfield() {
		return passwordfield;
	}


	public WebElement getLoginbtn2() {
		return loginbtn2;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
// Drag And Drop
	
	
}
