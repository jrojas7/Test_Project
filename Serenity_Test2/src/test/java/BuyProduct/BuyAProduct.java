package BuyProduct;

import Abilities.BuyProduct.Authenticate;
import Questions.BuyProduct.The_Confirmation_Message;
import Tasks.BuyProduct.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;


@RunWith(SerenityRunner.class)
public class BuyAProduct {

    private Actor anna = Actor.named("Anna").whoCan(Authenticate.
            with("jcarlostest9@gmail.com","Control123")
    );

    @Managed
    private WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    @WithTag("shopping:addItemToCart")
    public void should_be_able_to_add_item_to_my_shopping_cart() throws InterruptedException {
        givenThat(anna).
                wasAbleTo(SignIn.intoTheSoppingAccount());
        and(anna).wasAbleTo(ChooseTheDressType.
                fromTheMenu("Evening Dresses"));
        and(anna).wasAbleTo(OrderTheItems.
                by("Price: Lowest first"));
        and(anna).attemptsTo(AddItemToShoppingCart.called("Printed Dress"));
        when(anna).attemptsTo(Confirm_The_Order.inForm());
        then(anna).should(seeThat(The_Confirmation_Message.title(), is("Your order on My Store is complete.")));
        Thread.sleep(20000);
    }
}