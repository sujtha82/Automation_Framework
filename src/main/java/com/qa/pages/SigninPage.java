package com.qa.pages;
import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.qa.util.Log4j.Log;


public  class SigninPage extends TestBase {



    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signinbtn;


    @FindBy(css = "#ap_email")
    WebElement email;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement continuebtn;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement signinbtn1;

    public SigninPage() throws IOException {
        super();
        PageFactory.initElements ( driver , this );

        Log.info("******SigninStarted***");
    }

    public String verifySigninPageTitle() {

            return driver.getTitle ();

        }

        public HomePage signin(String un , String pwd) throws IOException {

        signinbtn.click ();
        email.sendKeys ( un );
        continuebtn.click ();
        password.sendKeys ( pwd );
        signinbtn1.click ();
        return new HomePage ();


    }

}