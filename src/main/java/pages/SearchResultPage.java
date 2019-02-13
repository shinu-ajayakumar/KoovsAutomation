package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BasePage {

	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void selectFirstProduct() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.xpath("//*[@class='prodImg']")).get(1)));
		driver.findElements(By.xpath("//*[@class='prodImg']")).get(0).click();
	}

	public SearchResultPage sortByWhatIsNew() {
		driver.findElement(By.xpath("//span[@class='sort-text']")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//li[contains(text(),'What') and contains(text(),'New')]")).click();
		return this;
	}
}
