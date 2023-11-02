package pageObject;

public interface HomePageElements {
	String addCartProduct1Buttons = "(//div[@class=\"button-group\"] //i[@class=\"fa fa-shopping-cart\"])[1]";
	String addCartProduct4Buttons = "(//div[@class=\"button-group\"] //i[@class=\"fa fa-shopping-cart\"])[4]";
	
	String totalCartProducts = "cart-total";
	String viewCart = "//strong[normalize-space()='View Cart']";
}
