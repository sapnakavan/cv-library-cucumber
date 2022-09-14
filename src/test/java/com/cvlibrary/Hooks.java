package com.cvlibrary;

import com.cucumber.listener.Reporter;
import com.cvlibrary.pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import com.cvlibrary.propertyreader.PropertyReader;
import com.cvlibrary.utility.Utility;

import java.io.IOException;


/**
 * Created by bhavesh patel
 */
public class Hooks extends Utility {

    @Before
    public void setUp() throws InterruptedException {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        new Utility().acceptCookiesAndSwitchToIframe();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
