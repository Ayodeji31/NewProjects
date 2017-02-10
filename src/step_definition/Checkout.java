package step_definition;

import java.util.concurrent.TimeUnit;

import module.Test_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageobject.HomeAndFurniturepage;
import pageobject.LandingPage;
import pageobject.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout extends Test_Base{
	
	public WebDriver driver = getDriver();
	
	@Given("^Am on the homepage$")
	public void am_on_the_homepage() throws Throwable {
		driver.navigate().to("http://pat.dunelm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^I move cursor to curtains and blinds$")
	public void i_move_cursor_to_curtains_and_blinds() throws Throwable {
//		WebElement Menu = driver.findElement(By.cssSelector("#cat-curtains-blinds"));
//		Actions action = new Actions(driver);
//		action.moveToElement(Menu).build().perform();
//		driver.findElement(By.cssSelector("#ProductListProductLink_236784 > h2")).click();
		LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
		landingpage.Move_To_Element();
		
	}

	@And("^I selected from the list of values under ready made blinds$")
	public void i_selected_from_the_list_of_values_under_ready_made_blinds() throws Throwable {
		LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);
		landingpage.click_Venetian_Blind();	
	   
	}

	@And("^I selected Black hardwood blinds$")
	public void i_selected_Black_hardwood_blinds() throws Throwable {
		HomeAndFurniturepage homeandfurniture = PageFactory.initElements(driver, HomeAndFurniturepage.class);
		homeandfurniture.click_Black_Hardwood();
	}

	@When("^I selected size and quantity$")
	public void i_selected_size_and_quantity() throws Throwable {
		ProductPage productpage = PageFactory.initElements(driver, ProductPage.class);
		productpage.click_BlindSize();
		Thread.sleep(1000);
		productpage.click_BlindWidth();
		productpage.click_quantity();
		productpage.click_quantiNo(); 
	    
	}

	@When("^I clicked Add to basket$")
	public void i_clicked_Add_to_basket() throws Throwable {
		ProductPage productpage = PageFactory.initElements(driver, ProductPage.class);
		productpage.click_addToCart();
		Thread.sleep(1000);
	   
	}

	@Then("^I should see a pop-up$")
	public void i_should_see_a_pop_up() throws Throwable {
		ProductPage productpage = PageFactory.initElements(driver, ProductPage.class);
		productpage.Message_is_Dispalyed();
	   
	}

	@Then("^I click coninue shopping$")
	public void i_click_coninue_shopping() throws Throwable {
		ProductPage productpage = PageFactory.initElements(driver, ProductPage.class);
		productpage.click_cont_shopping();
		driver.close();
	   
	}
	
	



}
