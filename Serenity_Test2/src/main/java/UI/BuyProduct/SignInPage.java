package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SignInPage {
    public static Target SIGN_IN_LINK = Target.the("the sign in menu option").located(By.linkText("Sign in"));
    public static Target USER_EMAIL = Target.the("the user email field").located(By.id("email"));
    public static Target USER_PASSWORD = Target.the("the user password field").located(By.id("passwd"));
}

