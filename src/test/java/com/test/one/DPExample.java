package com.test.one;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPExample {

	@Test(dataProvider = "checkEquation")
	public void customerLoginTest(int valueOne, int valueTwo, int result) throws InterruptedException {

		Assert.assertEquals(valueOne + valueTwo, result);
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void customerProfile() {
		System.out.println("This is customer profile");
	}

	@DataProvider(name = "checkEquation")
	public Object[][] testData() {

		return new Object[][] { { 1, 2, 3 }, { 20, -20, 0 }, { -5, -20, -25 }, { 10, -8, 2 } };
	}

//	public static void main(String[] args) {
//		
//		String[][] customers = new String[][]{
//			
//				{"Adnan", "Rahman"},
//				{"Jhon", "Doe"},
//				{"Sami", "Rahman"},
//				{"Saleh", "Ahmed"}
//		};
//		
//		for (int i=0; i < customers.length; i++) {
//			
//			for (int j=0; j < customers[0].length; j++) {
//				System.out.print(customers[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//	}

}
