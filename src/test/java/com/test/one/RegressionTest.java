package com.test.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegressionTest {
	
	WebDriver driver;
	
	@Test
	public void openChromeBrowser() {
		System.out.println("Opening chrome browser");
		System.setProperty("webdriver.chrome.driver", "/Users/adnanrahman/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void processNumOne() {
		System.out.println("process number one");
	}
	
	@Test
	public void openFirefoxBrowser() {
		System.out.println("Opening firefox browser");
		System.setProperty("webdriver.gecko.driver", "/Users/adnanrahman/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.tiktok.com");
	}
	
	@Test
	public void processNumTwo() {
		System.out.println("process number two");
	}
}
