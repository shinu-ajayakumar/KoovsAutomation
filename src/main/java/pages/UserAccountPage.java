package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserAccountPage extends BasePage {

	@FindBy(className = "myacc_headingText")
	private WebElement header_myAccount;

	public UserAccountPage(WebDriver driver) {
		super(driver);
	}

	public void verifyMyAccountHeaderDisplayed() {
		Assert.assertTrue(header_myAccount.isDisplayed());
		Assert.assertEquals(header_myAccount.getText().toLowerCase(), "my account");
	}

}
