package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLogIn {
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		 driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("maksura1980@gmail.com");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("hampton4015");
		 driver.findElement(By.xpath(" (//*[@class='btn btn-default'])[1]")).click();
		 driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		
		
	 
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to(BaseConfig.getConfigValue("QA_URLa"));
//		driver.manage().window().maximize();
		
		
//		MasterPageFactory mpf = new MasterPageFactory(driver);
//		
//		mpf.getLoginbtn().click();
//		mpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
//		mpf.getPasswordfield().sendKeys(BaseConfig.getConfigValue("password"));
//		


	}

}
