package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private By username=By.xpath("(//a[@title='View my customer account'])");
	
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getUserName()
	{
		return driver.findElement(username).getText();
	}
}
