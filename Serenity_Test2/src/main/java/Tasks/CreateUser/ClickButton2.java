package Tasks.CreateUser;

import UI.CreateUser.ButtonSignIn2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButton2 implements Task {
    public ClickButton2() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonSignIn2.SIGNIN_BUTTON2)
        );
    }

    public static ClickButton2 inForm2(){
        return instrumented(ClickButton2.class);
    }
}
