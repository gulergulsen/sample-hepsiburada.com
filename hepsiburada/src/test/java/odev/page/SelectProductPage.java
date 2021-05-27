package odev.page;

import odev.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static odev.constants.Constants.*;

public class SelectProductPage extends BasePage {

    public SelectProductPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public SelectProductPage select(){
        clickBy(SELECT_PRODUCT);
        return this;
    }

}
