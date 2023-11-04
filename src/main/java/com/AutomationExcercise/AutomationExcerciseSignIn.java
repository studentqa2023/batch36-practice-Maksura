package com.AutomationExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcerciseSignIn {
	
	public void getAutomationSignIn() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://automationexercise.com/");
		 driver.manage().window().maximize();	
		 Thread.sleep(2000);
		 driver.close();
		 driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		 driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Maksura Parvin");
		 driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("maksura1980@gmail.com");
		 driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
//		 driver.close();
		// driver.findElement(By.xpath("//*[contains(text(), 'Login']")).click();
	}
	
 	public static void main(String[] args) throws InterruptedException {
 		AutomationExcerciseSignIn obj = new AutomationExcerciseSignIn();
 		obj.getAutomationSignIn();
	}
	}


