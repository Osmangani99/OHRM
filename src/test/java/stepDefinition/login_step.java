package stepDefinition;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObject.login_page;

public class login_step extends config { login_page login = new login_page(driver);

    @Given("I am at orangeHRM")
    public void iAmAtOrangeHRM() {

        String Actual_Title = driver.getTitle();
        System.out.println("This is the title I have when I land in the page==============>>>>>"+ Actual_Title);
        String  expected_Title = "OrangeHRM";

        Assert.assertEquals(Actual_Title,expected_Title);


    }

    @And("I input valid ID and password")
    public void iInputValidIDAndPassword() {
//        login.enter_userName("Admin");
//        login.enter_password("admin123")
        login.enter_credential("Admin","admin123");
        
    }

    @Then("I click longin button")
    public void iClickLonginButton() {

        login.click();

    }

    @And("I click facebook logo from the footer of the page")
    public void iClickFacebookLogoFromTheFooterOfThePage() {

        login.click_faceBook();
    }

    @And("I click linkedIn logo from the footer of the page")
    public void iClickLinkedInLogoFromTheFooterOfThePage() {
        login.click_linkedIn();
    }

    @And("I click YouTube logo from the footer of the page")
    public void iClickYouTubeLogoFromTheFooterOfThePage() {
        login.click_youTube();
    }

    @And("I click twitter logo from the footer of the page")
    public void iClickTwitterLogoFromTheFooterOfThePage() {
        login.click_twitter();
    }


    @And("I verify there is placeHolder for userName and Password")
    public void iVerifyThereIsPlaceHolderForUserNameAndPassword() {
        login.verify_placeHolder();
    }

}
