package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By login = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPasswordLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void setUserName(String uname) {
		driver.findElement(emailId).sendKeys(uname);
	}

	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	
	public AccountPage doLogin(String uname, String pwd)
	{
		setUserName(uname);
		setPassword(pwd);
		clickOnLogin();		
		return new AccountPage(driver);
	}
	
	
}
