package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moresearchoption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salarymin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salarymax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salarytype;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobtype;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findjobsbutton;


    public void enterjobtitle(String title) {
        sendTextToElement(jobtitle, title);

    }

    public void enterlocation(String locat) {
        sendTextToElement(location, locat);
    }

    public void selectdistance(String mile) {
        selectByVisibleTextFromDropDown(distance, mile);
    }

    public void clickonmoresearchoptionlink() {
        clickOnElement(moresearchoption);
    }

    public void entersalrymin(String min) {
        sendTextToElement(salarymin, min);

    }

    public void entersalarymax(String max) {
        sendTextToElement(salarymax, max);
    }

    public void selctsalarytype(String type) {
        selectByVisibleTextFromDropDown(salarytype, type);

    }

    public void selectjobtype(String jotype) {
        selectByVisibleTextFromDropDown(jobtype, jotype);
    }

    public void clickonfindjobbutton() {
        clickOnElement(findjobsbutton);
    }



}
































