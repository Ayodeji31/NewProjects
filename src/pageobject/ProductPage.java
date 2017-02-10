package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
public WebDriver driver;


@FindBy(how=How.NAME, using="Blind Size")
public static WebElement Blind_Sizes;

@FindBy(how=How.XPATH, using="//*[@id='attrBlind Size']/option[3]")
public static WebElement Blind_Size_select;

@FindBy(how=How.ID, using="quantity")
public static WebElement Quantities;

@FindBy(how=How.XPATH, using= "//*[@id='quantity']/option[2]")
public static WebElement Quantity_3;


@FindBy(how=How.ID, using= "add2CartBtn")
public static WebElement Add_to_Cart;

@FindBy(how=How.XPATH, using= "//*[@id='product']/div[2]/div[2]/div/div/div/div[1]/h4/span[2]")
public static WebElement  Message_Displayed;

@FindBy(how=How.XPATH, using= "//*[@id='product']/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/p/button")
public static WebElement Continue_shopping;




public void click_BlindSize(){
	Blind_Sizes.click();
	
}

public void click_BlindWidth(){
	Blind_Size_select.click();
	
	
}
public void click_quantity(){
	Quantities.click();

}
public void click_quantiNo(){
	Quantity_3.click();	
}

public void click_addToCart(){
	Add_to_Cart.click();	
}

public void Message_is_Dispalyed(){
	Message_Displayed.isDisplayed();	
}

public void click_cont_shopping(){
	Continue_shopping.click();	
}

}