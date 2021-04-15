package com.thezebra.step_definitions;

import com.thezebra.pages.StartPage;
import com.thezebra.utilities.Driver;
import com.thezebra.utilities.PageObjectMgr;
import com.thezebra.utilities.WebElementMgr;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

public class UserFlowStepDefinitions {

    @Then("user should see the {string} title")
    public void user_should_see_the_title(String string) {
        String title = Driver.getDriver().getTitle().toString();
//        System.out.println("Title================="+title);
        Assert.assertTrue(title.contains(string));
    }

    @Then("user clicks {string}")
    public void user_clicks(String string) throws Exception {
//        PageObjectMgr.setCurrentPage("HomePage");
        WebElement element = (WebElement) WebElementMgr.getWebElement(PageObjectMgr.getCurrentPage(), string);
        element.click();
        Thread.sleep(2000);
    }

    @Then("User set the page {string}")
    public void user_set_the_page(String str) throws Exception {
        PageObjectMgr.setCurrentPage(str);
    }

    @Then("user types {string} to {string}")
    public void user_types(String input, String locator) throws InterruptedException, AWTException {
        WebElement element = (WebElement) WebElementMgr.getWebElement(PageObjectMgr.getCurrentPage(), locator);
        element.sendKeys(input);

        Actions actions = new Actions(Driver.getDriver());

        Robot robot = new Robot();

        robot.mouseMove(50, 50);

        actions.click().build().perform();

        robot.mouseMove(200, 70);

        actions.click().build().perform();

//        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("user navigates to start page")
    public void user_navigates_to_start_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user waits until page loads")
    public void user_waits_until_page_loads() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 50);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='carrier-info-wrapper']")));
    }


    @Then("user selects {string}")
    public void user_selects(String string) throws InterruptedException {
        StartPage startPage = new StartPage();
        WebElement element = startPage.selectRadioButton(string);
        element.click();
        Thread.sleep(2000);

    }

    @Then("user cliks {string}")
    public void user_cliks(String string) throws InterruptedException {
        WebElement element = (WebElement) WebElementMgr.getWebElement(PageObjectMgr.getCurrentPage(), string);
        element.click();
        Thread.sleep(2000);
    }

    @Then("user writes {string} to {string}")
    public void user_writes(String string, String locator) throws InterruptedException {
        WebElement element = (WebElement) WebElementMgr.getWebElement(PageObjectMgr.getCurrentPage(), locator);
        element.sendKeys(string);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("user can see the result")
    public void user_can_see_the_result() {
        List<WebElement> element = (List<WebElement>) WebElementMgr.getWebElement(PageObjectMgr.getCurrentPage(), "companyNames");

        // System.out.println("*******************" + dataTable);

        //      for (WebElement e : element) {
//            System.out.println(e.getText());
//            Assert.assertTrue(e.getText().contains(dataTable.get(0)) ||
//                    e.getText().contains(dataTable.get(1)) ||
//                    e.getText().contains(dataTable.get(2)) ||
//                    e.getText().contains(dataTable.get(3)));
        Assert.assertTrue(element.size() >= 1);
        // }
    }
}
