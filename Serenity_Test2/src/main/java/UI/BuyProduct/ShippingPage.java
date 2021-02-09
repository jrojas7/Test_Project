package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShippingPage {
    public static Target CHECK_OUT_BUTTON4 = Target.the("the proceed to checkout button 3").
            located(By.name("processCarrier"));

    public static Target CHECKBOX = Target.the("the proceed to check the Terms checkbox").
            located(By.id("cgv"));
}
