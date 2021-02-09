package Questions.VerifyEmail;

import Models.VerifyEmail.Users;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetUsersQuestion implements Question {

    public Users answeredBy(Actor actor){
        return SerenityRest.lastResponse().as(Users.class);
    }

}
