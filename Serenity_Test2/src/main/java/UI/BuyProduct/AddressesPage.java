package UI.BuyProduct;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AddressesPage {
    public static Target CHECK_OUT_BUTTON3 = Target.the("the proceed to checkout button 3").
            located(By.name("processAddress"));
}
