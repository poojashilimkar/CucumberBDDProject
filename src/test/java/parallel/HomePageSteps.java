package parallel;

import org.junit.Assert;

import com.pages.AccountPage;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	HomePage homePage=new HomePage(DriverFactory.getDriver());
	private  AccountPage accpage =new AccountPage(DriverFactory.getDriver()); 
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.out.println(homePage.getHomePageTitle());
	    
	}
	

@When("user click on home button")
public void user_click_on_home_button() {
	accpage.clickONHomeButton();
   
}

	@Then("user name should dispalayed on the page as {string}")
	public void user_name_should_dispalayed_on_the_page_as(String username) {
	   
		System.out.println(username);
		System.out.println(homePage.getUserName());
		Assert.assertTrue(homePage.getUserName().contains(username));
	
	}

}
