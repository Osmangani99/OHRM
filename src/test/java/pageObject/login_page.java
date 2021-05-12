package pageObject;

import base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends config {


    public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "txtUsername")
    public WebElement userName;

    @FindBy(how = How.ID, using = "txtPassword")
    public WebElement password;

    @FindBy(how = How.ID, using = "btnLogin")
    public WebElement login_Button;

    @FindBy(how = How.XPATH, using = "//img[@alt='OrangeHRM on Facebook']")
    public WebElement faceBook_login_Option;

    @FindBy(how = How.XPATH, using = "//img[@alt='LinkedIn OrangeHRM group']")
    public WebElement linkedIn_login_option;

    @FindBy(how = How.XPATH, using = "//img[@alt='OrangeHRM on youtube']")
    public WebElement youTube_login_option;

    @FindBy(how = How.XPATH, using = "//img[@alt='OrangeHRM on twitter']")
    public WebElement twitter_login_option;


    //****************** Login page elements ************

//    public void enter_userName(String Input_userName){
//        userName.sendKeys(Input_userName); }
//
//    public void enter_password(String Input_password){
//        password.sendKeys(Input_password); }


    public void verify_placeHolder(){

        String userAttribute = userName.getAttribute("name");
        System.out.println("Here is the placeHolder for userName==============>" + userAttribute);

       String passwordAttribute =  password.getAttribute("name");
       System.out.println("Here is the placeHolder for password ================>"+passwordAttribute);

    }

    public void enter_credential(String Input_userName, String Input_password) {

        userName.sendKeys(Input_userName);
        password.sendKeys(Input_password);

    }

    public void click() {
        login_Button.click(); }


    public void click_linkedIn() {
        linkedIn_login_option.click(); }

    public void click_youTube() {
        youTube_login_option.click(); }

    public void click_twitter() {
        twitter_login_option.click(); }

    public void click_faceBook() {
        faceBook_login_Option.click(); }











}
