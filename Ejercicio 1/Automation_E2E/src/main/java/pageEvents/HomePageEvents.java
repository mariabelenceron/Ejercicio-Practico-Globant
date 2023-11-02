package pageEvents;

import org.testng.Assert;

import pageObject.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch element = new ElementFetch();

	public void addToCart(String selector) {
		element.getWebElement("XPATH", selector).click();
	}
	
	public void verifyTotalCartButton(String noProducts) {
		Assert.assertTrue(element.getWebElement("ID", HomePageElements.totalCartProducts).getText().contains(noProducts), "Element not found");
	}
	
	public void viewCart() {
		element.getWebElement("ID", HomePageElements.totalCartProducts).click();
		element.getWebElement("XPATH", HomePageElements.viewCart).click();
	}

}
