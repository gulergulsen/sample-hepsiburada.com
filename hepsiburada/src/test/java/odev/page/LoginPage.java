package odev.page;

import odev.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static odev.constants.Constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public LoginPage login(String username, String password){
        clickBy(SIGN_BUTTON_HOVER);
        clickBy(SIGN_BUTTON_CLICK);
        setByXpath("//input[@id='txtUserName']",username);
        setByXpath("//input[@id='txtPassword']" , password);
        clickBy(LOGIN_BUTTON);

        return this;
    }

}
