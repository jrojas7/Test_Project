package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;

public class OrderConfirmationPage {
    public static Target CONFIRMATION_MESSAGE = Target.the("the proceed to compare the page confirmation").
            locatedBy("#center_column > div > p > strong");
}

