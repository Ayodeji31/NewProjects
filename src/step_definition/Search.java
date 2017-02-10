package step_definition;

import module.Test_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobject.LandingPage;
import pageobject.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Search extends Test_Base{
	
	WebDriver driver = getDriver();
	
	@Given("^I entered \"([^\"]*)\" in the search field$")
	public void i_entered_in_the_search_field(String product) throws Throwable {
		LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
		landingpage.type_search(product);
	}

	@Given("^I click on search Icon$")
	public void i_click_on_search_Icon() throws Throwable {
		LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
		landingpage.Click_Search_Btn();
	}

	@Then("^te product searched for should be displayed$")
	public void te_product_searched_for_should_be_displayed() throws Throwable {
	  //SearchPage searchpage = PageFactory.initElements(driver, SearchPage.class); 
	  //searchpage.Search_Message_displayed();
	}



}
