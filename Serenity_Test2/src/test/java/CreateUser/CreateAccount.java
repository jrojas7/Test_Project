package CreateUser;

import Questions.CreateUser.TheUserName;
import Questions.CreateUser.The_Home_Page_Title;
import Tasks.CreateUser.*;
import com.github.javafaker.Faker;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class CreateAccount {
    private Actor karen = Actor.named("Karen");

    @Managed
    private WebDriver herBrowser;

    private Faker accountData = new Faker();
    private String userEmail = accountData.internet().emailAddress();
    private String userFirstName = accountData.address().firstName();
    private String userLastName = accountData.address().lastName();

    @Before
    public void karenCanBrowseTheWeb(){
        karen.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void should_create_account() throws InterruptedException {
        givenThat(karen).wasAbleTo(
                LoadPage.inTheBrowser()
        );
        and(karen).attemptsTo(ClickButton.inForm());
        and(karen).attemptsTo(FillEmail.inForm2(userEmail));
        and(karen).attemptsTo(ClickButton2.inForm2());
        when(karen).attemptsTo(Fill.theCreateAccountForm(accountData, userFirstName, userLastName));
        then(karen).should(seeThat(TheUserName.title(), is(userFirstName + " " + userLastName)));
        and(karen).should(seeThat(The_Home_Page_Title.title(),is("MY ACCOUNT")));
        Thread.sleep(5000);

    }
}
