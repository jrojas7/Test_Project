package Tasks.CreateUser;

import UI.CreateUser.MyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadPage implements Task {
    MyPage myPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(myPage)
        );
    }

    public static LoadPage inTheBrowser(){
        return instrumented(LoadPage.class);
    }
}
