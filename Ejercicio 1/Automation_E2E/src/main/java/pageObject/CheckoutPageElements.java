package pageObject;

public interface CheckoutPageElements {
	String checkoutTitle = "//h1[normalize-space()='Checkout']";
	
	String guestCustomerRadioButton = "input[value='guest']";
	String continueButton = "button-account";
	
	String personalDetailsTitle = "//legend[normalize-space()='Your Personal Details']";
	String firstNameInput = "input-payment-firstname";
	String lastNameInput = "input-payment-lastname";
	String emailInput = "input-payment-email";
	String telephoneInput = "input-payment-telephone";
	String address1Input = "input-payment-address-1";
	String address2Input = "input-payment-address-2";
	String cityInput = "input-payment-city";
	String postCodeInput = "input-payment-postcode";
	String countrySelect = "input-payment-country";
	String regionSelect = "input-payment-zone";
	String continuePDButton = "button-guest";
	
	String flatRateTitle = "//strong[normalize-space()='Flat Rate']";
	String continueDeliveryMethodButton = "button-shipping-method";
	
	String bankTransferRadioButton = "input[value='bank_transfer']";
	String termAndConditionCheckbox = "//input[@name='agree']";
	String continuePMButton = "button-payment-method";
	
	String bankTransferTitle = "//h2[normalize-space()='Bank Transfer Instructions']";
	String confirmOrderButton = "button-confirm";
}
