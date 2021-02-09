package UI.CreateUser;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonSignIn {
    public static Target SIGNIN_BUTTON = Target.the("signIn button").locatedBy("//a[@class='login']");
}
