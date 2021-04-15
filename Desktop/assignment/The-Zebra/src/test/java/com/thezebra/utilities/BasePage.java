package com.thezebra.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //we don't want to access these variables outside
    protected static final Logger logger = LogManager.getLogger();


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
//    public void waitUntilLoaderScreenDisappear() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
//            logger.info("Loader mask gone...");
//        } catch (Exception e) {
//            logger.error("Loader mask doesn't present.");
//            logger.error(e);
//        }
//    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            logger.error("Failed to click on :: " + tab);
            logger.error(e);
            BrowserUtils.clickWithWait(By.xpath(tabLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            logger.error("Failed to click on :: " + module);
            logger.error(e);
            BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
    }


}
