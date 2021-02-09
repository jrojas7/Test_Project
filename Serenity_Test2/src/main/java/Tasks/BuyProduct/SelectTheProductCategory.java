package Tasks.BuyProduct;

import UI.BuyProduct.ShoppingDashboardPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SelectTheProductCategory {

    public static Task called(String itemCategory) {
        return Task.where("{0} select the category: #itemCategory",
                MoveMouse.to(ShoppingDashboardPage.getDressType(itemCategory)),
                Click.on(ShoppingDashboardPage.QUICK_VIEW_ITEM_LINK)
        ).with("itemCategory").of(itemCategory);
    }
}

