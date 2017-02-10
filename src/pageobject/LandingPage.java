package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage extends MyBaseClass{
	public LandingPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(how=How.CSS, using="#header_navigation > ul.header__mega-menu__list.header__mega-menu__list--desktop > li:nth-child(3) > a")
	public static WebElement Menu;
	
	@FindBy(how=How.LINK_TEXT, using="Venetian Blinds")
	public static WebElement Venetian_Blind;
	
	@FindBy(how=How.ID, using = "search")
	public static WebElement Search_field;
	
	@FindBy(how=How.ID, using = "search_submit")
	public static WebElement Submit_Search;
	
	
	
	
	public void Move_To_Element(){
		Actions action = new Actions(driver);
		action.moveToElement(Menu).build().perform();
	}
	public void click_Venetian_Blind(){
		Venetian_Blind.click();
	}
	
	public void type_search(String product){
		Search_field.sendKeys(product);
	}
	
	public void Click_Search_Btn(){
		Submit_Search.click();
	}

}
