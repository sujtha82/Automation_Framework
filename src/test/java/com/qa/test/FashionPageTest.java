package com.qa.test;

import com.qa.base.TestBase;
import com.qa.pages.FashionPage;
import com.qa.pages.HomePage;
import com.qa.pages.NewReleasesPage;
import com.qa.pages.SigninPage;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class FashionPageTest<string> extends TestBase {
    SigninPage sp;
    HomePage hp;
    FashionPage fp;

    public FashionPageTest() throws IOException {
        super();

    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialiazation ();
        sp = new SigninPage ();
        //nrp = new NewReleasesPage ();
        fp = new FashionPage ();
        hp = sp.signin ( prop.getProperty ( "username" ) , prop.getProperty ( "password" ) );

        fp =hp.clickOnfashionLink ();
        fp=hp.clickOnfashionLink ();

    }

    @Test(priority = 1)
    public void verifyFashionLinkTest() {
        fp = hp.clickOnfashionLink ();


    }


    @Test(priority = 2)
    public void searchTest() throws IOException {
        WebDriver driver = null;
        fp = new FashionPage ();
        String actualTitle = fp.searchbtn (
                "girl");

    }





    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
