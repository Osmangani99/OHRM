package pageObject;

import base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends config {


    public login_page (WebDriver driver){ PageFactory.initElements(driver,this); }


    @FindBy(how = How.ID,using = "txtUsername")
    public WebElement userName;

    @FindBy (how = How.ID,using = "txtPassword")
    public WebElement password;

    @FindBy(how = How.ID,using = "btnLogin")
    public WebElement login_Button;

        //****************** Login page elements ************

    public void enter_userName(String Input_userName){
        userName.sendKeys(Input_userName); }

    public void enter_password(String Input_password){
        password.sendKeys(Input_password); }

    public void click_loginButton(){
        login_Button.click(); }




}
