package Tasks.CreateUser;

import UI.CreateUser.ButtonSignIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButton implements Task {
    public ClickButton() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonSignIn.SIGNIN_BUTTON)
        );
    }

    public static ClickButton inForm(){
        return instrumented(ClickButton.class);
    }
}
