package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	
	private WebDriver driver;
	private By cart=By.xpath("//a[@title='View my shopping cart']");
	private By accuntList=By.xpath("//ul[@class='myaccount-link-list']//li");
	private By homeButtom=By.xpath("//a[@title='Home']");
	
	public AccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickONHomeButton()
	{
		driver.findElement(homeButtom).click();
	}
	public String getAccountPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnCartButton()
	{
		driver.findElement(cart);
	}
	
	public int getAccountMenuListCount()
	{
		return driver.findElements(accuntList).size();
	}
	
	public ArrayList<String> getAccountMenuList()
	{
		ArrayList<String> list=new ArrayList<String>();
		List<WebElement> webelement =driver.findElements(accuntList);
		
		for(WebElement e:webelement)
		{
			String text=e.getText();
			System.out.println(text);
			list.add(text);
		}
		
		return list;
	}
}
