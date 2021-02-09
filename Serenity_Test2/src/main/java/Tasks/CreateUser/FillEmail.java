package Tasks.CreateUser;

import UI.CreateUser.Form2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hover;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillEmail implements Task {
    private final String myEmail;

    public FillEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(myEmail).into(Form2.EMAIL_FIELD)
        );
    }

    public static FillEmail inForm2(String myEmail){
        return instrumented(FillEmail.class,myEmail);
    }
}
