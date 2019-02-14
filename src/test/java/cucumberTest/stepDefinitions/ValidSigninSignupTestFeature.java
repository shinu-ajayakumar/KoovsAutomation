package cucumberTest.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;
import validLoginTests.BaseTest;

public class ValidSigninSignupTestFeature extends BaseTest {

	@Given("^I am on signin page$")
	public void i_am_on_signin_page() throws Throwable {
		homePage.open().clickMyAccountLogin();
	}

	@When("^I enter email as \"([^\"]*)\"$")
	public void i_enter_email_as(String email) throws Throwable {
		loginPage.enterEmail(email);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		loginPage.clickLogin();
	}

	@Then("^I should be in my dashboard page$")
	public void i_should_be_in_my_home_page() throws Throwable {
		userDashboardPage.clickMyAccount();
		userAccountPage.verifyMyAccountHeaderDisplayed();
	}

	@Given("^I am on signup page$")
	public void i_am_on_signup_page() throws Throwable {
		homePage.open().clickMyAccountSignUp();
	}

	@When("^I enter a new name as \"([^\"]*)\"$")
	public void i_enter_a_new_name_as(String name) throws Throwable {
		signupPage.enterName(name);
	}

	@When("^I enter a new email as \"([^\"]*)\"$")
	public void i_enter_a_new_email_as(String email) throws Throwable {
		signupPage.enterEmail(email);
	}

	@When("^I enter a new password as \"([^\"]*)\"$")
	public void i_enter_a_new_password_as(String password) throws Throwable {
		signupPage.enterPassword(password);
	}

	@When("^I enter a new mobile number as \"([^\"]*)\"$")
	public void i_enter_a_new_mobile_number_as(String mobileNumber) throws Throwable {
		signupPage.enterMobile(mobileNumber);
	}

	@When("^I click signup button$")
	public void i_click_signup_button() throws Throwable {
		signupPage.clickSignup();
	}

	@When("^I proceed with payment$")
	public void i_proceed_with_payment() throws Throwable {
		homePage.open().clickMyAccountLogin();
		loginPage.signinUsing("testemail@gmail.com", "test@Koovs");
		productDetails.goTo("/oxford-palm-tree-shirt-120439.html").selectSize("Small").clickAddToBag().clickGoToBag();
		cartPage.clickProceedToCheckout();
		orderSummaryPage.clickConfirmAndPay();
	}

	@When("^I enter card number as \"([^\"]*)\"$")
	public void i_enter_card_number_as(String cardNumber) throws Throwable {
		paymentPage.enterCardNumber(cardNumber);
	}

	@When("^I enter expiry month as \"([^\"]*)\"$")
	public void i_enter_expiry_month_as(String month) throws Throwable {
		paymentPage.selectExpiryMonth(month);
	}

	@When("^I enter expiry year as \"([^\"]*)\"$")
	public void i_enter_expiry_year_as(String year) throws Throwable {
		paymentPage.selectExpiryYear(year);
	}

	@When("^I enter CVV as \"([^\"]*)\"$")
	public void i_enter_CVV_as(String cvv) throws Throwable {
		paymentPage.enterCVV(cvv);
	}

	@When("^I click Pay now button$")
	public void i_click_Pay_now_button() throws Throwable {
		paymentPage.clickPayNow();
	}
}
