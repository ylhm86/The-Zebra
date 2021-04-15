package com.thezebra.pages;

import com.thezebra.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DriversPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Save & continue')]")
    public WebElement saveAndContinue;

    @FindBy(xpath = "//input[@id='dropdown-input-current_carrier-0']")
    public WebElement currentInsurance;

    @FindBy(xpath = "//input[@id='email-0']")
    public WebElement email;

    @FindBy(xpath = "//span[contains(text(),'Show my quotes')]")
    public WebElement showMyQuotes;

    @FindBy(xpath = "(//div[text()='No'])[1]")
    public WebElement clickNo;

    @FindBy(xpath = "(//div[text()='No'])[2]")
    public WebElement clickNoToSave;

    @FindBy(xpath = "//h4[@data-cy='carrierName']")
    public List<WebElement> companyNames;

}
