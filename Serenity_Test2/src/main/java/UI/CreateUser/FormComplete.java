package UI.CreateUser;

import net.serenitybdd.screenplay.targets.Target;

public class FormComplete {
    public static Target USER_TITLE = Target.the("user title").locatedBy("//input[@id='id_gender1']");
    public static Target FNAME_FIELD = Target.the("fname field").locatedBy("//input[@id='customer_firstname']");
    public static Target LNAME_FIELD = Target.the("lname field").locatedBy("//input[@id='customer_lastname']");
    public static Target PWD_FIELD = Target.the("pwd field").locatedBy("//input[@id='passwd']");
    public static Target DATE_OF_BIRTH_DAYS = Target.the("the day of birth date").locatedBy("//select[@id='days']");
    public static Target ADDRESS_FIELD = Target.the("add field").locatedBy("//*[@id='address1']");
    public static Target CITY_FIELD = Target.the("city field").locatedBy("//*[@id='city']");
    public static Target STATE_FIELD = Target.the("state field").locatedBy("//*[@id='id_state']");
    public static Target ZIP_FIELD = Target.the("zip field").locatedBy("//*[@id='postcode']");
    //public static Target COUNTRY_FIELD = Target.the("country field").locatedBy("//*[@id=\"id_country\"]");
    public static Target PHONE_FIELD = Target.the("phone field").locatedBy("//*[@id='phone']");
    public static Target CELLPHONE_FIELD = Target.the("cellphone field").locatedBy("//*[@id='phone_mobile']");
    public static Target ALIAS_FIELD = Target.the("alias field").locatedBy("//*[@id='alias']");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//*[@id='submitAccount']/span");
    public static Target USER_FULL_NAME = Target.the("user full name").locatedBy("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span");
}
