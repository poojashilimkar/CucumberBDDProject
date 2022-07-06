package com.stepdefination;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class LoginPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	static private String title;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getPageTitle();
		System.out.println(title);
	}

	@Then("page title Should be {string}")
	public void page_title_should_be(String expetcedTitleName) {

		Assert.assertTrue(title.contains(expetcedTitleName));
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
	}

	/*
	 * @Given("user is login page") public void user_is_login_page() {
	 * 
	 * }
	 */
	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		loginPage.setUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.setPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

}
