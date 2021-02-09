package Tasks.BuyProduct;

import UI.BuyProduct.CartItemPage;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckOutItem {
    public static AnonymousTask inTheCart() {
        return Task.where("{0} proceeds to check out the item in the cart",
                WaitUntil.the(CartItemPage.CHECK_OUT_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartItemPage.CHECK_OUT_BUTTON)
        );
    }
}
