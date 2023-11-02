package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObject.ProductPageElements;
import utils.ElementFetch;

public class ProductPageEvents {

	ElementFetch element = new ElementFetch();

	public void verifyIfProductPageIsLoaded() {
		Assert.assertTrue(element.getWebElements("CSS", ProductPageElements.returnHomeButton).size() > 0, "Element not found");
	}

	public void selectOptionByText(String selector, String option) {
		WebElement dropdown = element.getWebElement("ID", selector);
		Select select = new Select(dropdown);
		select.selectByVisibleText(option);
	}
	
	public void addToCart() {
		element.getWebElement("ID", ProductPageElements.addToCartButton).click();
	}
}


