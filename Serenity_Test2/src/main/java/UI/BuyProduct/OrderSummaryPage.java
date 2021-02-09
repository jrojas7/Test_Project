package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;

public class OrderSummaryPage {

    public static Target CONFIRM_ORDER_BUTTON = Target.the("the proceed to confirm order").
            locatedBy("//*[@id='cart_navigation']/button/span");
}
