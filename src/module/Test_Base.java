package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Base {
	
	public static WebDriver driver;
	
	public WebDriver getDriver(){
		if(driver == null){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();	
		}
		return driver;
	}

}
