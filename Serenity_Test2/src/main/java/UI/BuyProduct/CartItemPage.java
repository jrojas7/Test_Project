package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;

public class CartItemPage {

    public static Target CHECK_OUT_BUTTON = Target.the("the proceed to checkout button").
            locatedBy("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
}

