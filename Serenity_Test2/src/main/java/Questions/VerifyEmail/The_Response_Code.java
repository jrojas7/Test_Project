package Questions.VerifyEmail;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class The_Response_Code implements Question {
    public static Question<Integer> was(){
        return new The_Response_Code();
    }

    @Override
    public Integer answeredBy(Actor actor){
        return SerenityRest.lastResponse().statusCode();
    }

}
