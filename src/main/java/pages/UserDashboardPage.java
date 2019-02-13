package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboardPage extends BasePage {

	@FindBy(xpath = "//a[text()='SIGN OUT ']")
	private WebElement link_signOut;

	@FindBy(xpath = "//*[@class='sprite-item h_myaccount']")
	private WebElement menu_MyAccount;

	public UserDashboardPage(WebDriver driver) {
		super(driver);
	}

	public void clickMyAccount() {
		menu_MyAccount.click();
	}
}
