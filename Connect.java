package Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Connect {

    public static void selectValueFromDropDown(WebElement element,String Value){

        Select select= new Select(element);
        select.selectByVisibleText(Value);
    }
}
