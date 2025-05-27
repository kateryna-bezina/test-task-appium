package flows.cart;

import core.platform.PlatformManager;
import pages.cart.CartPage;

public class CartFlow {
    private final CartPage cartPage;

    public CartFlow(CartPage cartPage) {
        this.cartPage = cartPage;
    }

    //we can manage slightly different flows for Android and iOS via methods in flows
    public void proceedToCheckout() {
        if (PlatformManager.isIOS()) {
            cartPage.acceptPaymentTerms();
        }
        cartPage.clickCheckoutButton();
    }
}
