package odev.test;

import com.sun.org.glassfish.gmbal.Description;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import odev.base.BaseTest;
import odev.page.LoginPage;
import odev.page.SearchProductPage;
import odev.page.SelectProductPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    @Description("Login")
    @Given("User of Hepsiburada on the Login Page")

    @And("Hepsiburada user try to login")
    public void loginTest() throws InterruptedException {
        before();
        new LoginPage(driver, wait)
                .login("canfesss@gmail.com", "Qwe.1234");

    }
    @And("Hepsiburada user try to searching for the product")
    public void searchTest(){
        new SearchProductPage(driver, wait)
                .search("iphone 12");
    }
    @And("Hepsiburada user try to selecting for the product")
    public void selectTest(){
        new SelectProductPage(driver, wait)
                .select();
    }

    @Then("The product should selected")
    public void tearDown() {
        driver.quit();
    }
}
