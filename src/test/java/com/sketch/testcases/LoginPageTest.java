package com.sketch.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.sketch.base.TestBase;
import com.sketch.pages.HomePage;
import com.sketch.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	HomePage homePage;
	//LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		//loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "SketchWall");
	}
	
	@Test(priority=2)  
	public void sketchImageTest() {
		boolean flag = homePage.validateSketchImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void urlTest() throws InterruptedException
	{
		homePage.login(prop.getProperty("url"));
		Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void searchTest() throws InterruptedException 
	{
		homePage.validateSearchBtn();
	
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
