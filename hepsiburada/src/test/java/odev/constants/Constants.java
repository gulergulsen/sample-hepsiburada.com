package odev.constants;

import org.openqa.selenium.By;

public class Constants {

    public static final By SIGN_BUTTON_HOVER = By.id("myAccount");
    public static final By SIGN_BUTTON_CLICK = By.xpath("//a[@id='login']");
    //public static final By EMAIL_VALUE = By.xpath("//input[@id='txtUserName']");
    //public static final By PASSWORD_VALUE = By.xpath("//input[@id='txtPassword']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@id='btnLogin']");
    public static final By SEARCH_BUTTON = By.xpath("//div[contains(text(),'ARA')]");
    public static final By SELECT_PRODUCT = By.className("carousel-lazy-item");
}
