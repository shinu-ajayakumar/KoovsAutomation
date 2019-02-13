package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(id = "login-email")
	private WebElement txt_emailAddress;
	
	@FindBy(id = "login-pswd")
	private WebElement txt_password;
	
	@FindBy(xpath = "//button[text()='LOG IN']")
	private WebElement btn_Login;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage enterEmail(String email) {
		txt_emailAddress.sendKeys(email);
		return this;
	}

	public LoginPage enterPassword(String password) {
		txt_password.sendKeys(password);
		return this;
	}

	public void clickLogin() {
		btn_Login.click();	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void signinUsing(String email, String password) {
		txt_emailAddress.sendKeys(email);
		txt_password.sendKeys(password);
		btn_Login.click();	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
