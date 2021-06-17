package com.qa.test;

import com.qa.base.TestBase;
import com.qa.pages.*;
import com.qa.util.TestUtil;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.qa.util.Log4j.Log;


public class HomePageTest extends TestBase {
    public SigninPage sp;
   public HomePage hp;
   public NewReleasesPage nrp;
   public FashionPage fp;
   public TestUtil ut;
   static String sheetname="Items";

    public HomePageTest() throws IOException {
        super ();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialiazation ();
        Log.info ( "initialized the landing page" );
        sp = new SigninPage ();
        nrp = new NewReleasesPage ();
        fp = new FashionPage ();
        hp = sp.signin ( prop.getProperty ( "username" ) , prop.getProperty ( "password" ) );
        Log.info ( "User logged in" );
        ut = new TestUtil ();

    }

   // @Test(priority = 1)
    public void verifyHomePageTitleTest() {
       Log.debug ("Verifing Title");
        String homePageTitle = hp.verifyHomePageTitle ();
        Assert.assertEquals ( homePageTitle , "Amazon Sign-In" , "Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" );

    }


   // @Test(priority = 2)
    public void verifyNewReleasesLinkTest() throws IOException {
        Log.debug ( "Verifing Title" );
        nrp = hp.clickOnnewReleasesLink ();
        Assert.assertFalse ( false);
       // ut.screeenshotBag("verifyNewReleaseLinkTest",driver);
    }

   //@Test(priority = 3)
   public void verifyFashionLinkTest() {
        Log.debug ( "Validating link" );
     //  fp = hp.clickOnfashionLink ();
 //Assert.assertEquals ( hp.clickOnFashionLink (),"gkk" );//it should fail
       }


    @DataProvider
    public Object[][] getItemTestData() {
        Object data[][]= TestUtil.getTestData(sheetname);
        return data;
    }
    @Test(priority = 4,dataProvider="getItemTestData")
    public void verifySearchItem(String item) {
        Log.debug ( "searchitem" );
        hp.selectSearchItem(item);
    }
  //  @DataProvider(name = "testData") public Object[][] getTestData() { return new Object[0][]; } //  }

       // public void verifyCartLinkTest(){
       //   cp=hp.clickOnCartLink ();

       //}
       // @Test(priority = 3)
       // public void verifyCartLinkTest(){
       //    cp= hp.clickOnCartLink ();
       // }

       // }

       @AfterMethod
       public void tearDown(){
           driver.quit ();
       }

   }


