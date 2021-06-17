package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.ExcelHelper;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

import static com.qa.util.Log4j.Log;


public class HomePage extends TestBase {
 // public static Logger log =(Logger) LogManager.getLogger (ExcelHelper.class);
    @FindBy(xpath = "/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[1]")
    WebElement newReleasesLink;
    @FindBy(xpath = "//*[@id=\'nav-xshop\']/a[4]")

    WebElement fashionLink;


    public HomePage() throws IOException {
        super ();
        PageFactory.initElements ( driver , this );
        Log.info ( "******HomePage has Started***" );
    }

    public String verifyHomePageTitle() {
        Log.info ( "check the homepageurl" );
        return driver.getTitle ();
    }


    public NewReleasesPage clickOnnewReleasesLink() throws IOException {
        newReleasesLink.click ();
        return new NewReleasesPage ();
    }


    public FashionPage clickOnfashionLink() {
        fashionLink.click ();
        return null;
    }


    public void selectSearchItem(String item) {
        WebElement searchtextbox = driver.findElement ( By.id ( "twotabsearchtextbox" ) );
        searchtextbox.sendKeys ( item );

        WebElement goButton = driver.findElement ( By.cssSelector ( "input[value=Go] " ) );
        goButton.click ();

    }

}





