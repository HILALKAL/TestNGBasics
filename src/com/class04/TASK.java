package com.class04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommonMethods;

/*
 * Identify Priority of Test Cases

https://www.saucedemo.com/

TC 1: Saucedemo Username1(parameters - username and password)
Step 1: Open browser and navigate to Saucedemo
Step 2: Enter username standard_user and enter password secret_sauce and click login button
Step 3: Verify user successfully logged in

TC 2: Saucedemo Username2(parameters - username and password)
Step 1: Open browser and navigate to Saucedemo
Step 2: Enter username problem_user and enter password secret_sauce and click login button
Step 3: Verify user successfully logged in


Note: Create BeforeMethod and AfterMethod annotations to open browser and logout from the application. Create a xml file with parameters username and password .
 */
public class TASK extends CommonMethods{
	
	@Parameters({"browser","url"})
	@BeforeMethod(alwaysRun=true)
	public void setUp(String chrome,String link) {
		setUpDriver(chrome,link);
	}
	
	@Parameters({"username","password"})
	@Test
	public void login1(String username,String password) {
		sendText(driver.findElement(By.cssSelector("input#user-name")), username);
		sendText(driver.findElement(By.cssSelector("input#password")), password);
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}

	@Parameters({"username2","password2"})
	@Test
	public void login2(String username,String password) {
		sendText(driver.findElement(By.cssSelector("input#user-name")), username);
		sendText(driver.findElement(By.cssSelector("input#password")), password);
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}
	@AfterMethod(alwaysRun=true,groups="Smoke")
	public void tearDown() {
		driver.close();
	}
}
