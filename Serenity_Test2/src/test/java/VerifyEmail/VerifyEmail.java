package VerifyEmail;

import Models.VerifyEmail.Datum;
import Questions.VerifyEmail.GetUsersQuestion;
import Questions.VerifyEmail.The_Response_Code;
import Tasks.VerifyEmail.GetEmails;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;


@RunWith(SerenityRunner.class)
public class VerifyEmail {
    private final String restApiUrl = "https://reqres.in/api/users?page=2";

    @Test
    public void testToVerifyEmail(){
        Actor anna = Actor.named("Anna")
                .whoCan(CallAnApi.at(restApiUrl));
        anna.attemptsTo(GetEmails.fromPage(2)
        );
        anna.should(
                seeThat("The response code", The_Response_Code.was(), equalTo(200))
        );

        Datum user = new GetUsersQuestion().answeredBy(anna)
                .getData().stream().filter(x -> x.getId() == 7).findFirst().orElse(null);

        anna.should(
                seeThat("user exists", act -> user, notNullValue())
        );
        anna.should(
                seeThat("the user email", act -> user.getEmail(), equalTo("michael.lawson@reqres.in"))
        );
    }
}
