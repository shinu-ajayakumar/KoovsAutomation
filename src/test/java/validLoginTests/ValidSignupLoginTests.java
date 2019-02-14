package validLoginTests;

import org.testng.annotations.Test;

public class ValidSignupLoginTests extends BaseTest {

	@Test
	public void SignupTestWithValidData() {
		homePage.open()
				.clickMyAccountSignUp();
		signupPage.enterName("Shinu")
				.enterEmail("testemail@gmail.com")
				.enterPassword("test@Koovs")
				.enterMobile("9995405012")
				.selectGender("Male")
				.clickSignup();
		userDashboardPage.clickMyAccount();
		userAccountPage.verifyMyAccountHeaderDisplayed();
	}

	@Test
	public void LoginTestWithValidEmailAndPassword() {
		homePage.open()
				.clickMyAccountLogin();
		loginPage.enterEmail("testemail@gmail.com")
				.enterPassword("test@Koovs")
				.clickLogin();
		userDashboardPage.clickMyAccount();
		userAccountPage.verifyMyAccountHeaderDisplayed();
	}

	@Test
	public void PaymentTestWithValidDetails() {
		homePage.open()
				.clickMyAccountLogin();
		loginPage.signinUsing("testemail@gmail.com","test@Koovs");
		productDetails.goTo("/oxford-palm-tree-shirt-120439.html")
					.selectSize("Small")
					.clickAddToBag()
					.clickGoToBag();
		cartPage.clickProceedToCheckout();
		orderSummaryPage.clickConfirmAndPay();
		paymentPage.enterCardNumber("1234567890123456")
					.selectExpiryMonth("12")
					.selectExpiryYear("2019")
					.enterCVV("123")
					.clickPayNow();
	}

	
}
