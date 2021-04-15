package com.thezebra.step_definitions;

import com.thezebra.utilities.ConfigurationReader;
import com.thezebra.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeStepDefinitions {

    // Pages pages = new Pages();

    @When("user navigates to home page")
    public void user_navigates_to_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("verify the {string} title")
    public void verify_the_title(String string) {

        Assert.assertEquals(string, Driver.getDriver().findElement(By.xpath("//h1[contains(@class,'hero-headline')]")).getText());
    }

    @Then("verify the {string} insurances")
    public void verify_the_insurances(String string) {

        Assert.assertEquals(string, Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Compare')]")).getText());
    }

    @Then("verify the {string} tools")
    public void verify_the_tools(String string) {

        Assert.assertEquals(string, Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Tools & Tips')]")).getText());
    }

    @Then("verify the {string} button")
    public void verify_the_button(String string) {

        Assert.assertEquals(string, Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Company')]")).getText());
    }
}
