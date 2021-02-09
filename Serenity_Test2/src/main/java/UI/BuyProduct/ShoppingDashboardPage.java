package UI.BuyProduct;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class ShoppingDashboardPage {

    public static Target WOMEN_MENU_TAB = Target.
            the("the women menu tab").
            locatedBy("//*[@id='block_top_menu']/ul/li[1]/a");


    public static Target getDressType(String dressType ) {
        return Target.the("the dress type").
                located(By.linkText(dressType));
    }

    public static Target SORT_ITEM_BY_DROP_DOWN =
            Target.the("the sort drop down").
                    located(By.id("selectProductSort"));

    public static Target SORTING_ARTICLES_LOADING =
            Target.the("the loading message").
                    locatedBy("#layered_ajax_loader > p > br");

    public static Target LIST_VIEW_OPTION = Target.the("the list view option").
            locatedBy("#list > a > i");

    public static Target QUICK_VIEW_ITEM_LINK = Target.the("the quick view link inside the item").
            locatedBy("//*[@id='center_column']/ul/li/div/div/div[1]/div/a[2]/span");

    public static Target ITEM_IMAGE = Target.the("the list view option").
            locatedBy("//*[@id='center_column']/ul/li/div/div/div[1]/div/a[1]/img");

}
