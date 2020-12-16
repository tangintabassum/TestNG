package com.test.one;

import org.testng.annotations.Test;

public class SanityTest {
	
	@Test (groups = "aGroup")
	public void TestOne() {
		System.out.println("Test one");
	}
	
	@Test (groups = "bGroup")
	public void TestTwo() {
		System.out.println("Test two");
	}
	
	@Test ( groups = "aGroup")
	public void TestThree() {
		System.out.println("Test Three");
	}
	
	@Test (groups = "bGroup")
	public void TestFour() {
		System.out.println("Test four");
	}
	
	@Test (dependsOnGroups = "aGroup")
	public void TestFive() {
		System.out.println("Test five");
	}
	
	@Test (dependsOnMethods = "TestOne") 
	public void TestSix() {
		System.out.println("Test six");
	}
}
