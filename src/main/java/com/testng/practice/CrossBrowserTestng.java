package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestng {
	WebDriver driver;
	public void crossBrowserCostco(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("browser opened=+browser");
		}else if(browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
						
		}else {
			System.out.println("Page not found");
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
	}

}
