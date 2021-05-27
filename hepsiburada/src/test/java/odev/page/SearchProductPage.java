package odev.page;

import odev.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static odev.constants.Constants.*;

public class SearchProductPage extends BasePage {

    public SearchProductPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public SearchProductPage search(String product){
        setByXpath("//div[@id='SearchBoxOld']//input", product);
        clickBy(SEARCH_BUTTON);
        return this;
    }

}
