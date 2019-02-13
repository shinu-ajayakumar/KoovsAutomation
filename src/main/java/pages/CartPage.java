package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickProceedToCheckout() {
		driver.findElement(By.xpath("//div[text()='PROCEED TO CHECKOUT']")).click();
		
	}

}
