package pageEvents;

import org.testng.Assert;

import pageObject.SuccessPageElements;
import utils.ElementFetch;

public class SuccessPageEvents {
	ElementFetch element = new ElementFetch();

	public void verifyIfSuccessPageIsLoaded() {
		Assert.assertTrue(element.getWebElements("XPATH", SuccessPageElements.successTitle).size() > 0,
				"Element not found");
	}
}
