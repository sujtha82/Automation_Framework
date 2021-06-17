package com.qa.test;
import com.qa.base.TestBase;

import com.qa.pages.HomePage;
import com.qa.pages.SigninPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SiginPageTest extends TestBase {
    SigninPage signinPage;
    HomePage loginPage;


    public SiginPageTest() throws IOException {
        super ();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialiazation ();
        signinPage = new SigninPage ();
    }
       // public static LogManager logger = LogManager.getLogManager ( SigninPageTest.class.getName () );



    @Test(priority = 1)
    public void signinPageTitleTest() throws IOException{
        String title = signinPage.verifySigninPageTitle ();
        Assert.assertEquals ("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more","Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" );
    }

    @Test(priority = 2)
    public void signinPageTest() throws IOException {
        loginPage = signinPage.signin ( prop.getProperty ( "username" ) , prop.getProperty ( "password" ) );
    }

   // public void getName() {
    //    Object name;

    @AfterMethod
    public void tearDown() {
        driver.quit ();
    }





}




