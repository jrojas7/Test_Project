package Tasks.BuyProduct;

import UI.BuyProduct.ShoppingDashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import net.serenitybdd.screenplay.Task;

public class OrderTheItems implements Task {

    private String orderType;

    public OrderTheItems(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(orderType).
                        from(ShoppingDashboardPage.
                                SORT_ITEM_BY_DROP_DOWN),

                WaitUntil.the(
                        ShoppingDashboardPage.SORTING_ARTICLES_LOADING,
                        isNotVisible()).
                        forNoMoreThan(5).seconds(),

                Click.on(ShoppingDashboardPage.LIST_VIEW_OPTION)
        );
    }

    public static OrderTheItems by(String orderType) {
        return instrumented(OrderTheItems.class, orderType);
    }
}
