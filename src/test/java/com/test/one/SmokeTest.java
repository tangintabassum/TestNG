package com.test.one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Smoke Before Class");
	}
	
	@BeforeMethod
	public void methodMethod() {
		System.out.println("Smoke Calling Before Method");
	}
	
	@Test
	public void TestOne() {
		System.out.println("Smoke Test number one");
	}
	
	@Test
	public void TestTwo() {
		System.out.println("Smoke Test number two");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Smoke Calling After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Smoke After class");
	}
	
}
