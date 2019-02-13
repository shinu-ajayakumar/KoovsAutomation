package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public abstract class BasePage {
	
	protected WebDriver driver;
	ConfigReader configReader;
	Actions action;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configReader = new ConfigReader();
		action = new Actions(driver);
		wait = new WebDriverWait(driver, 5);		
	}
}
