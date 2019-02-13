package validLoginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import browserUtils.Browser;
import pages.*;

public abstract class BaseTest {
	
	WebDriver driver;	
	HomePage homePage;
	LoginPage loginPage;
	SignupPage signupPage;
	UserDashboardPage userDashboardPage;
	UserAccountPage userAccountPage;
	SearchResultPage searchResultPage;
	ProductDetails productDetails;
	CartPage cartPage;
	
	@BeforeTest
	public void initialize() {		
		driver = Browser.getInstance("Chrome");
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		signupPage = new SignupPage(driver);
		userDashboardPage = new UserDashboardPage(driver); 
		userAccountPage = new UserAccountPage(driver);
		searchResultPage = new SearchResultPage(driver);
		productDetails = new ProductDetails(driver);
		cartPage = new CartPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		//Browser.quit();
	}

}
