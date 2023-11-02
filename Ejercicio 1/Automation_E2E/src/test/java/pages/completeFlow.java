package pages;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.CheckoutPageEvents;
import pageEvents.HomePageEvents;
import pageEvents.ProductPageEvents;
import pageEvents.ShoppingCartPageEvents;
import pageEvents.SuccessPageEvents;
import pageObject.HomePageElements;
import pageObject.ProductPageElements;
import utils.ElementFetch;

public class completeFlow extends BaseTest {
	ElementFetch element = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	ProductPageEvents productPage = new ProductPageEvents();
	ShoppingCartPageEvents shoppingCartPage = new ShoppingCartPageEvents();
	CheckoutPageEvents checkoutPage = new CheckoutPageEvents();
	SuccessPageEvents successPage = new SuccessPageEvents();

	@Test
	public void completeFlowTC() {
		homePage.addToCart(HomePageElements.addCartProduct1Buttons);
		homePage.addToCart(HomePageElements.addCartProduct4Buttons);

		productPage.verifyIfProductPageIsLoaded();
		productPage.selectOptionByText(ProductPageElements.colorSelect, "Red");
		productPage.addToCart();

		homePage.verifyTotalCartButton("2");
		homePage.viewCart();

		shoppingCartPage.verifyIfShoppingCartPageIsLoaded();
		shoppingCartPage.navigateToCheckout();

		checkoutPage.verifyIfCheckoutPageIsLoaded();
		checkoutPage.checkoutOptions();
		checkoutPage.billingDetails("John", "Doe", "john@gmail.com", "0998878786", "Test 1", "Av Test 2", "Quito",
				"180808", "Ecuador", "Pichincha");
		checkoutPage.deliveryMethod();
		checkoutPage.paymentMethod();
		checkoutPage.confirmOrder();
		
		successPage.verifyIfSuccessPageIsLoaded();
	}
}
