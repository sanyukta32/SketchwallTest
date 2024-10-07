package com.sketch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sketch.base.TestBase;

public class HomePage extends TestBase  {
	
	
	@FindBy(xpath= "//img[@style = 'margin-right: 10px;']")
	WebElement sketchImg;
	
	@FindBy(xpath="//button[contains(text(), 'Find')]")
	WebElement findBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateSketchImage()
	{
		return sketchImg.isDisplayed();
	}
	
	public HomePage login(String url)
	{
		
		return new HomePage();
	}
	
	public SearchPage validateSearchBtn() throws InterruptedException
	{
		WebElement searchElement= driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		searchElement.sendKeys("Web");
		Thread.sleep(3000);
		findBtn.click();
		Thread.sleep(5000);
		return new SearchPage();
	}
}
