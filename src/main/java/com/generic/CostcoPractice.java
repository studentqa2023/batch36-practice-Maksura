package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoPractice {
	@SuppressWarnings("deprecation")
	public void getMouseHover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		 driver.findElement(By.xpath("//*[contains(text(),'Sign In / Register') and @class='myaccount']")).click();
		 driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("maksura1980@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("AyaanManha1322$");
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 
		

	}
public static void main(String[] args) {
	CostcoPractice obj = new CostcoPractice();
	obj.getMouseHover();
}
	

}
