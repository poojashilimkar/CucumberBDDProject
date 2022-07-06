package com.stepdefination;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcountsPageStep {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountPage accountspage;
	String title;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credentialTable) {
		List<Map<String, String>> credList = credentialTable.asMaps();
		String uname = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		accountspage = loginPage.doLogin(uname, password);
	}

	@Given("user is on account page")
	public void user_is_on_account_page() {
		 title =accountspage.getAccountPageTitle();
	}

	@When("user click on cart button")
	public void user_click_on_cart_button() {
		accountspage.clickOnCartButton();

	}

	
	
	@Then("user gets account section")
	public void user_gets_account_section(DataTable menuTable) {

		List<String> expList = menuTable.asList();
		System.out.println("exp account list " + expList);

		List<String> actList = accountspage.getAccountMenuList();
		System.out.println("actual account list " + actList);
		
		Assert.assertTrue(expList.containsAll(actList));

	}

	@Then("acounts section count should be {int}")
	public void acounts_section_count_should_be(Integer expCount) {
		Assert.assertTrue(accountspage.getAccountMenuListCount() == expCount);
	}

}
