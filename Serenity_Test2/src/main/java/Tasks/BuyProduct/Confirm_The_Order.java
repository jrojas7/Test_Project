package Tasks.BuyProduct;

import UI.BuyProduct.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;

public class Confirm_The_Order implements Task{
    public Confirm_The_Order(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SummaryPage.CHECK_OUT_BUTTON2),
                Click.on(AddressesPage.CHECK_OUT_BUTTON3),
                Click.on(ShippingPage.CHECKBOX),
                Click.on(ShippingPage.CHECK_OUT_BUTTON4),
                Click.on(PaymentPage.PAY_BY_BANK),
                Click.on(OrderSummaryPage.CONFIRM_ORDER_BUTTON)
        );
    }
    public static Confirm_The_Order inForm(){
        return instrumented(Confirm_The_Order.class);
    }
}
