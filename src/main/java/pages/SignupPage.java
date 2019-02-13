package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	@FindBy(id = "reg-name")
	private WebElement txt_customerName;

	@FindBy(id = "reg-email")
	private WebElement txt_emailAddress;

	@FindBy(id = "reg-pswd")
	private WebElement txt_password;

	@FindBy(id = "reg-mobile")
	private WebElement txt_mobileNumber;

	@FindBy(xpath = "//*[@class='gender-check']/following-sibling::span[text()='FEMALE']")
	private WebElement chkbox_female;

	@FindBy(xpath = "//*[@class='gender-check']/following-sibling::span[text()='MALE']")
	private WebElement chkbox_male;

	@FindBy(xpath = "//button[text()='SIGN UP']")
	private WebElement btn_signUp;

	public SignupPage(WebDriver driver) {
		super(driver);
	}

	public SignupPage enterName(String customerName) {
		txt_customerName.sendKeys(customerName);
		return this;
	}

	public SignupPage enterEmail(String email) {
		txt_emailAddress.sendKeys(email);
		return this;
	}

	public SignupPage enterPassword(String password) {
		txt_password.sendKeys(password);
		return this;
	}

	public SignupPage enterMobile(String mobileNumber) {
		txt_mobileNumber.sendKeys(mobileNumber);
		return this;
	}

	public SignupPage selectGender(String gender) {
		if (gender.toLowerCase().equals("male")) {
			chkbox_male.click();
		}
		if (gender.toLowerCase().equals("female")) {
			chkbox_female.click();
		}
		return this;
	}

	public void clickSignup() {
		btn_signUp.click();
	}

}
