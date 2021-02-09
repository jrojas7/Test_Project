package Tasks.BuyProduct;

import Abilities.BuyProduct.Authenticate;
import UI.BuyProduct.ShoppingHomePage;
import UI.BuyProduct.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {

    private ShoppingHomePage shoppingHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(shoppingHomePage),
                Click.on(SignInPage.SIGN_IN_LINK),

                Enter.theValue(authenticated(actor).getUserName()).
                        into(SignInPage.USER_EMAIL),

                Enter.theValue(authenticated(actor).getUserPassword()).
                        into(SignInPage.USER_PASSWORD).
                        thenHit(Keys.RETURN)
        );
    }

    public static SignIn intoTheSoppingAccount() {
        return instrumented(SignIn.class);
    }

    private Authenticate authenticated(Actor actor) {
        return Authenticate.as(actor);
    }
}

