package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewItemPage {
    private static IFrame viewArticleIframe = IFrame.
            withPath(By.className("fancybox-iframe"));

    public static Target ADD_TO_CART_BUTTON = Target.
            the("the add to card button").
            inIFrame(viewArticleIframe).
            locatedBy("#add_to_cart > button > span");

}
