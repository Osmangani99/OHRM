package stepDefinition;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.login_page;

public class login_step extends config { login_page login = new login_page(driver);

    @Given("I am at orangeHRM")
    public void iAmAtOrangeHRM() {

    }

    @And("I input valid ID and password")
    public void iInputValidIDAndPassword() {
        login.enter_userName("Admin");
        login.enter_password("admin123");
        
    }

    @Then("I click longin button")
    public void iClickLonginButton() {

        login.click_loginButton();

    }
}
