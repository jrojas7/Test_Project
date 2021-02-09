package Questions.BuyProduct;

import UI.BuyProduct.OrderConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class The_Confirmation_Message implements Question<String> {
    public String answeredBy (Actor actor){
        return Text.of(OrderConfirmationPage.CONFIRMATION_MESSAGE).viewedBy(actor).asString();
    }

    public static The_Confirmation_Message title(){
        return new The_Confirmation_Message();
    }
}
