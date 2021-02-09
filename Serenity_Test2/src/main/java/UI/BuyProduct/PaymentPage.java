package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
    public static Target PAY_BY_BANK = Target.the("the proceed to pay").
            locatedBy("[href*='bankwire&controller=payment']");
}

