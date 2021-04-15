package com.thezebra.pages;

import com.thezebra.utilities.BasePage;
import com.thezebra.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='header-buttons']")
    public WebElement headerTitle;

    @FindBy(xpath = "//h1[contains(@class,'hero-headline')]")
    public WebElement radioButton;

    @FindBy(xpath = "//span[contains(text(), 'Compare')]")
    public WebElement compareButton;

    @FindBy(xpath = "//span[contains(text(), 'Tools & Tips')]")
    public WebElement toolsButton;

    @FindBy(xpath = "//span[contains(text(), 'Company')]")
    public WebElement companyButton;

    @CacheLookup
    public WebElement heroHeadline;
    @FindBy(xpath = "//div[@class='input-card']//label[@data-track-label='Car insurance']")
    @CacheLookup
    public WebElement labelCarInsurance;
    @FindBy(xpath = "//div[@class='input-card']//label[@data-track-label='Home insurance']")
    @CacheLookup
    public WebElement labelHomeInsurance;
    @FindBy(xpath = "(//input[@class='form-control with-icon zipcode-text-input'])[2]")
    @CacheLookup
    public WebElement zipCode;
    @FindBy(xpath = "(//span[contains(text(),'Get my quotes')])[2]")
    @CacheLookup
    public WebElement getMyQuotes;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement selectRadioButton(String str) {
        radioButton = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + str + "')]"));
        return radioButton;
    }


}
