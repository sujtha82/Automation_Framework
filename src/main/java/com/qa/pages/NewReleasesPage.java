package com.qa.pages;

import com.qa.base.TestBase;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.qa.util.Log4j.Log;
import static org.openqa.selenium.By.*;


public class NewReleasesPage extends TestBase {
    @FindBy(css = "#zg_left_col1 > div:nth-child(1) > div.zg_homeListLink > a")
    WebElement seemoreNewReleasesinVideoGamesLabel;
    @FindBy(css = "#zg_left_col1 > div:nth-child(1) > div:nth-child(5) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncate-desktop-type2")
    WebElement videoGameResident;


    public NewReleasesPage() throws IOException {
        super ();
        PageFactory.initElements ( driver , this );
        Log.info ( "******NewreleasePageStarted***" );
    }


    public boolean verifySeeNewReleasesinVideoGamesLabel() {
        return seemoreNewReleasesinVideoGamesLabel.isDisplayed ();

    }
}