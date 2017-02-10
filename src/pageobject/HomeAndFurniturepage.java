package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeAndFurniturepage {
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using= "ProductListProductLink_236784")
	public static WebElement Black_Hardwood_Blind; 
	
	
	
	
	public void click_Black_Hardwood(){
		Black_Hardwood_Blind.click();
	}

}
