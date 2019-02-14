package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public PaymentPage enterCardNumber(String cardNumber) {
		driver.findElement(By.xpath("//input[@name='field1']")).sendKeys(cardNumber);
		return this;
	}

	public PaymentPage selectExpiryMonth(String month) {
		select = new Select(driver.findElement(By.xpath("(//select[@class='expiry inputField'])[1]")));
		select.selectByVisibleText(month);
		return this;
	}

	public PaymentPage selectExpiryYear(String year) {
		select = new Select(driver.findElement(By.xpath("(//select[@class='expiry inputField'])[2]")));
		select.selectByVisibleText(year);
		return this;
	}

	public PaymentPage enterCVV(String cvv) {
		driver.findElement(By.name("cvv")).sendKeys(cvv);
		return this;
	}

	public void clickPayNow() {
		driver.findElement(By.className("confirmBtn")).click();
	}
}
