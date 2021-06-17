package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class FashionPage extends TestBase {

    @FindBy(xpath = "//*[@id=\'nav-xshop\']/a[4]")
    WebElement fashionLink;
    @FindBy(xpath = "//*[@id=\'nav-subnav\']/a[1]/span/img\n")
    WebElement amazonFashionLabel;
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[1]/span/img//*[@id=\"nav-xshop\"]/a[4")
    WebElement searchbtn;
    @FindBy(xpath = "//*[@id='live-flagship-root']/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/img")
    WebElement productlink;



    public FashionPage() throws IOException {
        super ();
        PageFactory.initElements ( driver , this );
    }

    public boolean verifyamazonFashionLabel() {
        return amazonFashionLabel.isDisplayed ();
    }
    public String searchbtn(String dress) {
        driver.findElement ( By.id ( "global-search-input" )).sendKeys(dress);
        driver.findElement(By.id("global-search-submit")).click();
        return  driver.getTitle ();




        }


}

