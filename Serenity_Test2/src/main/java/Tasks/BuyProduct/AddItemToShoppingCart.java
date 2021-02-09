package Tasks.BuyProduct;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;

public class AddItemToShoppingCart implements Task {

    private String dressName;

    public AddItemToShoppingCart(String dressName) {
        this.dressName = dressName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTheProductCategory.called(dressName),
                AddItem.toTheCart(dressName),
                CheckOutItem.inTheCart()
        );
    }

    public static AddItemToShoppingCart called(String dressName) {
        return instrumented(AddItemToShoppingCart.class, dressName);
    }
}
