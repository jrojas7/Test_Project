package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static Target CHECK_OUT_BUTTON2 = Target.the("the proceed to checkout button 2").
            locatedBy("[href*='controller=order&step=1']");
}
