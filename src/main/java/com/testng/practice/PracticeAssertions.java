package com.testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertions {
	int a = 5;
	int b = 3;
	@Test
	public void getSum() {
		System.out.println(a+b);
		//Assert.assertEquals(a+b,8);//by using boolean 
		Assert.assertEquals(a+b, 8);// by using int
		Assert.assertEquals(a+b, 10);//hard Assert
		
		
	}
	@Test
public void getMultiple() {
	System.out.println(a*b);
	
}
}
