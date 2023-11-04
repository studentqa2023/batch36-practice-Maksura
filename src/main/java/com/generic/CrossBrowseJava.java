package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowseJava {
	WebDriver driver;
	public void crossBrowserLogin(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("Not found any browser");
		}
		driver.navigate().to("https://www.costco.com/");
		driver.manage().window().maximize();
		
	}
public static void main(String[] args) {
	CrossBrowseJava obj = new CrossBrowseJava();
	obj.crossBrowserLogin("Firefox");
}
}
