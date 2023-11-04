package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 
public class parameterTestNG {
	@Test
	@Parameters("myName")
 public void practiceparam(String myName) {
	 System.out.println(myName);
 }
}
