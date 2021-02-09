package Tasks.BuyProduct;

import UI.BuyProduct.ShoppingDashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.Task;

public class ChooseTheDressType implements Task {

    private String dressType;

    public ChooseTheDressType(String dressType) {
        this.dressType = dressType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(ShoppingDashboardPage.WOMEN_MENU_TAB),

                WaitUntil.the(
                        ShoppingDashboardPage.getDressType(dressType), isVisible()
                ).forNoMoreThan(2).seconds(),

                Click.on(ShoppingDashboardPage.
                        getDressType(dressType))
        );
    }

    public static ChooseTheDressType fromTheMenu(String dressType) {
        return instrumented(ChooseTheDressType.class, dressType);
    }
}
