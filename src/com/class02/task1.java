package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import utils.CommonMethods;

/*
 * TC 1: OrangeHRM Title Validation

TC 2: OrangeHRM Successful Login 
https://opensource-demo.orangehrmlive.com/
Please make sure to use the following:
 annotations:
	@BeforeMethod
	@AfterMethod
	@Test

What would you do if you do not want to execute any specific test case?
What would you do if you want to execute any specific test case first?
 */
public class task1 extends CommonMethods {
	@BeforeClass
	public void setUp() {
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	}
	
	@Test(priority = 1)
	public void loginScreenTitle() {
	String loginScreenTitle =	driver.getTitle();
	String exptitle ="Web Orders Login";
	if(loginScreenTitle.equals(exptitle)) {
		System.out.println("this is the right title");
	}
	else {
		System.out.println("this is the wrong  title");
	}
	}
	
	@Test(priority=2)
	public void login() {
		sendText(driver.findElement(By.xpath("//input[contains(@id,'username')]")), "Tester");
		sendText(driver.findElement(By.xpath("//input[contains(@id,'password')]")), "test");
		driver.findElement(By.xpath("//input[contains(@id,'login_button')]")).click();
	}
	
	@Test(priority =3)
	public void webOrders() {
		WebElement webOrderTitle= driver.findElement(By.xpath("//h1[text()='Web Orders']"));
		if(webOrderTitle.isDisplayed()) {
			System.out.println("webOrderTitle is Displayed");
		}
		else {
			System.out.println("webOrderTitle is not Displayed");
		}
	}
	
	@AfterClass
	public void closed() {
		driver.close();
	}
	
	
	
}