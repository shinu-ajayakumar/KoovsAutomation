package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetails extends BasePage {

	public ProductDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public ProductDetails goTo(String endPoint) {
		driver.get(configReader.getBaseUrl() + endPoint);
		return this;
	}

	public ProductDetails selectSize(String size) {
		if (size.toLowerCase().contains("small")) {
			driver.findElement(By.xpath("//li[@class='size-data']/a[text()='S']")).click();
		}
		return this;
	}

	public ProductDetails clickAddToBag() {
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		return this;
	}

	public void clickGoToBag() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='GO TO BAG']")).click();
		
	}
}
