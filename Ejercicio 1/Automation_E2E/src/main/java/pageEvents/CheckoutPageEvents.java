package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObject.CheckoutPageElements;
import utils.ElementFetch;

public class CheckoutPageEvents {

	ElementFetch element = new ElementFetch();

	public void verifyIfCheckoutPageIsLoaded() {
		Assert.assertTrue(element.getWebElements("XPATH", CheckoutPageElements.checkoutTitle).size() > 0,
				"Element not found");
	}

	public void selectOptionByText(String selector, String option) {
		WebElement dropdown = element.getWebElement("ID", selector);
		Select select = new Select(dropdown);
		select.selectByVisibleText(option);
	}

	public void checkoutOptions() {
		element.getWebElement("CSS", CheckoutPageElements.guestCustomerRadioButton).click();
		element.getWebElement("ID", CheckoutPageElements.continueButton).click();
	}

	public void billingDetails(String firstname, String lastname, String email, String telephone, String address1,
			String address2, String city, String postCode, String country, String region) {
		Assert.assertTrue(element.getWebElements("XPATH", CheckoutPageElements.personalDetailsTitle).size() > 0,
				"Element not found");
		element.getWebElement("ID", CheckoutPageElements.firstNameInput).sendKeys(firstname);
		element.getWebElement("ID", CheckoutPageElements.lastNameInput).sendKeys(lastname);
		element.getWebElement("ID", CheckoutPageElements.emailInput).sendKeys(email);
		element.getWebElement("ID", CheckoutPageElements.telephoneInput).sendKeys(telephone);
		element.getWebElement("ID", CheckoutPageElements.address1Input).sendKeys(address1);
		element.getWebElement("ID", CheckoutPageElements.address2Input).sendKeys(address2);
		element.getWebElement("ID", CheckoutPageElements.cityInput).sendKeys(city);
		element.getWebElement("ID", CheckoutPageElements.postCodeInput).sendKeys(postCode);
		selectOptionByText(CheckoutPageElements.countrySelect, country);
		selectOptionByText(CheckoutPageElements.regionSelect, region);

		element.getWebElement("ID", CheckoutPageElements.continuePDButton).click();
	}
	
	public void deliveryMethod() {
		Assert.assertTrue(element.getWebElements("XPATH", CheckoutPageElements.flatRateTitle).size() > 0,
				"Element not found");
		element.getWebElement("ID", CheckoutPageElements.continueDeliveryMethodButton).click();
	}
	
	public void paymentMethod() {
		Assert.assertTrue(element.getWebElements("CSS", CheckoutPageElements.bankTransferRadioButton).size() > 0,
				"Element not found");
		element.getWebElement("XPATH", CheckoutPageElements.termAndConditionCheckbox).click();
		element.getWebElement("ID", CheckoutPageElements.continuePMButton).click();
	}
	
	public void confirmOrder() {
		Assert.assertTrue(element.getWebElements("XPATH", CheckoutPageElements.bankTransferTitle).size() > 0,
				"Element not found");
		element.getWebElement("ID", CheckoutPageElements.confirmOrderButton).click();
	}
}
