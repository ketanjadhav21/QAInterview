package com.intuit.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	SeleniumPOM objLogin;

	@BeforeTest

	public void setup(){

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/V4/");

	}

	/**

	 * This test case will login in http://demo.guru99.com/V4/

	 * Verify login page title as guru99 bank

	 * Login to application

	 * Verify the home page using Dashboard message

	 */

	@Test(priority=0)

	public void test_Home_Page_Appear_Correct(){

		//Create Login Page object
		
		objLogin = new SeleniumPOM(driver);

		//Verify login page title

		String loginPageTitle = objLogin.getLoginTitle();

		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		//login to application

		objLogin.login("mgr123", "mgr!23");

		// go the next page


	}
	
	public void test_select(){
		Select selectByValue = new Select(driver.findElement(By.id("")));
		selectByValue.selectByValue("green");

	
		Select selectByVisibleText = new Select (driver.findElement(By.id("")));
		selectByVisibleText.selectByVisibleText("limee");


		Select selectByIndex = new Select(driver.findElement(By.id("")));
		selectByIndex.selectByIndex(2);
		
		driver.findElement(By.linkText("")).click();
	}

}