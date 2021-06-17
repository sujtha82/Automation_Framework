package com.qa.test;


import com.qa.base.TestBase;
import com.qa.pages.FashionPage;
import com.qa.pages.HomePage;
import com.qa.pages.NewReleasesPage;
import com.qa.pages.SigninPage;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static com.qa.base.TestBase.initialiazation;
import static com.qa.base.TestBase.prop;
import static org.openqa.selenium.By.id;

public class NewReleasesPageTest extends TestBase {


    SigninPage sp;
    HomePage hp;
    NewReleasesPage np;
    FashionPage fp;
    ExtentReports extent;

    //private Object NewReleasesPage;


    public NewReleasesPageTest() throws IOException {
        super ();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialiazation ();
        sp = new SigninPage ();
        np = new NewReleasesPage ();
        fp = new FashionPage ();
        // vdp= new VideoGamesdevicespage();
        hp = sp.signin ( prop.getProperty ( "username" ) , prop.getProperty ( "password" ) );
        np = hp.clickOnnewReleasesLink ();
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
        //// vdp=np.selectVideoGame ( "Mass Effect Legendary Edition - PlayStation 4" );
        extent
                .addSystemInfo("Host Name", "QA")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "SA");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        extent.loadConfig(new File (System.getProperty("user.dir")+"\\extent-config.xml"));
    }





      @Test(priority = 1)
    public void verifyNewReleasesPageTest() {
        Assert.assertEquals ( ( "Resident Evil Village - PlayStation 5 Standard Edition" ) , "Resident Evil Village - PlayStation 5 Standard Edition" );
    }

    @Test(priority = 2)
    public void NewReleasesinVideoGamesLabel() throws Exception {
        Assert.assertEquals ( "TRUE" ,"FALSE");
        // Assert.assertTrue ( Boolean.parseBoolean ( "its there" ) );
    }

    @Test(priority = 3)
    public void selectVideoGame() {
        driver.findElement ( id ( "zg_left_col1" ) ).click ();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit ();
    }

}