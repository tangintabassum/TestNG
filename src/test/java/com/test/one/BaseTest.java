package com.test.one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * ##################################
 * 			TestNG Requirement:
 * ##################################
 * 
 * Install 'TestNG for Eclipse' from 'Eclipse Marketplace'
 * -------------------------------------------------------
 * >>> [Go to help] 
 * >>> [Eclipse marketplace] 
 * >>> [Inside 'find' type 'TestNG for Eclipse']
 * >>> [Then 'enter' and click install]
 * >>> [Confirm -> Finish]
 * >>> [Restart Eclipse]
 * 
 * ################################### 
 * !!!!!!!!!!!! WARNING !!!!!!!!!!!!!!
 * ###################################
 * 
 * If you don't find 'TestNG for Eclipse'
 * Please update your Eclipse!!!
 * 
 * >>> [Go to help]
 * >>> [Check for Updates]
 * >>> [Next -> Confirm -> finish] 
 * 
*/

/**
 *
 * @author DevilKnown
 * 
 * @BeforeSuite
 * 		@BeforeTest
 * 			@BeforeClass
 * 				@BeforeMethod
 * 					@Test
 * 				@AfterMethod
 * 			@AfterClass
 * 		@AfterTest
 * @AfterSuite
 */

public class BaseTest {
	
	/**
	 * Execute before each <suite> tag
	 * 
	 * Example: In this project we have one 'testng.xml' file
	 * Inside that file we have only one <suite> tag so it will execute only once
	 * for that <suite> tag, then everything inside that tag will be executed
	 */
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suit");
	}
	
	/**
	 * Execute before each class
	 * Example: Let say @BeforeClass annotation written in this class
	 * So this method will call only once for this class 
	 * If We have two classes and both of them have the method with @BeforeClass annotation 
	 * Then each method will be called with respect to each classes
	 */
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	/**
	 * Method with @BeforeTest annotation will be executed for each <test> tag
	 * in 'testng.xml' file.
	 * 
	 * It doesn't have any relationship with [ class, method, test ] 
	 */
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	/**
	 * Method with @BeforeMethod annotation will be executed before each @Test annotation
	 * Example: Here we have two method 'TestOne' & 'TestTwo' with @Test annotation
	 * So method with @BeforeMethod annotation will be executed two times   
	 */
	@BeforeMethod
	public void methodMethod() {
		System.out.println("Calling Before Method");
	}
	
	
	/**
	 * @Parameters annotation is used to pass any type of data 
	 * from 'testng.xml' file 
	 * 
	 * Example: We have declared a parameter tag in 'testng.xml' file
	 * with the name of "userName" and value "Adnan Rahman". So we can access 'userName'
	 * value using @Parameters annotation
	 * 
	 * @param name
	 * 
	 */
	@Parameters({"userName"})
	@Test
	public void TestOne(String name) {
		System.out.println("Test number one");
		System.out.println(name);
	}
	
	// Here we are passing two variable 'browser' and 'count' using @Parameters annotation
	@Parameters({"browser", "count"})
	@Test
	public void TestTwo(String browser, int c) {
		System.out.println("Test number two");
		System.out.println(browser);
		System.out.println(c);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Calling After Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}	
}
