package com.thezebra.step_definitions;


import com.thezebra.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {
    //default HOOK runs for any scenario
    @Before
    public void setup(Scenario scenario) {
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //will attach screenshot into report
            scenario.attach(image, "image/png", "screenshot");
        }
        Driver.closeDriver();
        System.out.println("AFTER");
    }


//    @After(value = "@storemanager", order = 1)
//    public void teardownForStoreManager(){
//        System.out.println("AFTER FOR STORE MANAGER");
//    }
//
//    //this hook will work
//    //only for scenarios with a tag @storemanager
//    //also, it will run before default hook
//    //because of priority
//    @Before(value = "@storemanager", order = 1)
//    public void setupForStoreManager(Scenario scenario){
//        System.out.println("BEFORE FOR STORE MANAGER");
//    }

}
