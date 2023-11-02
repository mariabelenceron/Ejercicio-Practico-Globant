package pageEvents;

import org.testng.Assert;

import pageObject.ShoppingCartPageElements;
import utils.ElementFetch;

public class ShoppingCartPageEvents {

	ElementFetch element = new ElementFetch();

	public void verifyIfShoppingCartPageIsLoaded() {
		Assert.assertTrue(element.getWebElements("XPATH", ShoppingCartPageElements.breadcrumbTitle).size() > 0, "Element not found");
	}

	public void navigateToCheckout() {
		element.getWebElement("XPATH", ShoppingCartPageElements.checkoutButton).click();
	}
}


