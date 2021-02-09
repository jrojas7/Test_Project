package Tasks.BuyProduct;

import UI.BuyProduct.ViewItemPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddItem {

    public static Task toTheCart(String dressName) {
        return Task.where("{0} adds the item to the cart",
                // WaitUntil.the(ViewItemPage.getAddressTitleElement(dressName), isVisible()).
                //          forNoMoreThan(5).seconds(),
                Click.on(ViewItemPage.ADD_TO_CART_BUTTON)
        ).with("dressName").of(dressName);
    }
}
