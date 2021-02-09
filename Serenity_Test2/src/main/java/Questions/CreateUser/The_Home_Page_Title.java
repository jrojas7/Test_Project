package Questions.CreateUser;

import UI.CreateUser.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class The_Home_Page_Title implements Question<String> {
    public String answeredBy (Actor actor){
        return Text.of(HomePage.HOME_PAGE_TITLE).viewedBy(actor).asString();
    }

    public static The_Home_Page_Title title(){
        return new The_Home_Page_Title();
    }
}

