package Abilities.BuyProduct;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Authenticate implements Ability {
    private String userName;
    private String userPassword;

    public Authenticate(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public static Authenticate with(String userName, String userPassword) {
        return new Authenticate(userName, userPassword);
    }

    public static Authenticate as(Actor actor) {
        return actor.abilityTo(Authenticate.class);
    }
}
