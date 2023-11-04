package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropDown {

	public void getDropDown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.globalsqa.com/");
		
        Select sc = new Select(driver.findElement(By.xpath("")));
        sc.selectByVisibleText("Cyprus");
        sc.selectByIndex(3);
        sc.selectByValue("BGD");

		
	}
	public static void main(String[] args) {
		
		PracticeDropDown obj = new PracticeDropDown();
		obj.getDropDown();
	}
}
