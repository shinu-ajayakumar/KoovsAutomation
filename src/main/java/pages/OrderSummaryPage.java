package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends BasePage{

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickConfirmAndPay() {
		driver.findElement(By.xpath("//div[text()='CONFIRM & PAY']")).click();
		
	}

}
