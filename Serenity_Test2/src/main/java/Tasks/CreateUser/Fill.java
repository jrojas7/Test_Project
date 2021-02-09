package Tasks.CreateUser;

import UI.CreateUser.FormComplete;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Fill implements Task {
    private Faker accountData;
    private String userFirstName;
    private String userLastName;

    public Fill(Faker accountData, String userFirstName, String userLastName) {
        this.accountData = accountData;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormComplete.USER_TITLE),
                Enter.theValue(userFirstName).into(FormComplete.FNAME_FIELD),
                Enter.theValue(userLastName).into(FormComplete.LNAME_FIELD),
                Enter.theValue(accountData.internet().password()).into(FormComplete.PWD_FIELD),
                // SelectFromOptions.byValue(String.valueOf(accountData.number().numberBetween(1,31))).from(FormComplete.DATE_OF_BIRTH_DAYS),
                Enter.theValue(accountData.address().fullAddress()).into(FormComplete.ADDRESS_FIELD),
                Enter.theValue(accountData.address().city()).into(FormComplete.CITY_FIELD),
                SelectFromOptions.byValue(String.valueOf(accountData.number().numberBetween(1,50))).from(FormComplete.STATE_FIELD),
                Enter.theValue("12345").into(FormComplete.ZIP_FIELD),
                //SelectFromOptions.byValue(String.valueOf(accountData.number().numberBetween(1,1))).from(FormComplete.COUNTRY_FIELD)
                Enter.theValue("12345789").into(FormComplete.PHONE_FIELD),
//                Enter.theValue(accountData.phoneNumber().cellPhone()).into(FormComplete.CELLPHONE_FIELD),
//                Enter.theValue(accountData.phoneNumber().cellPhone()).into(FormComplete.ALIAS_FIELD),
                Click.on(FormComplete.REGISTER_BUTTON)

        );
    }

    public static Fill theCreateAccountForm(Faker accountData, String userFirsName, String userLastName){
        return instrumented(Fill.class,accountData, userFirsName, userLastName);
    }
}
