package Questions.CreateUser;

import UI.CreateUser.FormComplete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheUserName implements Question<String> {
        public String answeredBy (Actor actor){
            return Text.of(FormComplete.USER_FULL_NAME).viewedBy(actor).asString();
        }
        public static Questions.CreateUser.TheUserName title(){
            return new Questions.CreateUser.TheUserName();
        }
    }
