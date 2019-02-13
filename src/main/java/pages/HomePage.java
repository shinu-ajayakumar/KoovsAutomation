package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	@FindBy(xpath = "//*[@class='sprite-item h_myaccount']")
	private WebElement menu_MyAccount;

	@FindBy(linkText = "LOGIN")
	private WebElement link_Login;

	@FindBy(linkText = "SIGN UP")
	private WebElement link_SignUp;

	@FindBy(id = "search-input-field")
	private WebElement txt_searchBox;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage open() {
		driver.get(configReader.getBaseUrl());
		return this;
	}

	public void clickMyAccountLogin() {
		movetoMyAccount();
		link_Login.click();
	}

	public void clickMyAccountSignUp() {
		movetoMyAccount();
		link_SignUp.click();
	}

	public void movetoMyAccount() {
		wait.until(ExpectedConditions.visibilityOf(menu_MyAccount));
		action.moveToElement(menu_MyAccount).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchFor(String searchKeyword) {
		txt_searchBox.sendKeys(searchKeyword);
		txt_searchBox.sendKeys(Keys.ENTER);
	}
}
