package com.thezebra.pages;

import com.thezebra.utilities.BasePage;
import com.thezebra.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    public WebElement radioButton;
    @FindBy(xpath = "//input[@name='first_name-0']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@name='last_name-0']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@name='date_of_birth-0']")
    public WebElement DOB;
    @FindBy(xpath = "//div[@class='col-sm']")
    public WebElement labelCustomYes;
    @FindBy(xpath = "//div[@class='col-sm mt-sm-0 mt-xxxs']")
    public WebElement getLabelCustomNo;
    @FindBy(xpath = "//div[contains(text(),'I own my home')]")
    public WebElement myHome;
    @FindBy(xpath = "//div[contains(text(),'I own my condo')]")
    public WebElement myCondo;
    @FindBy(xpath = "//div[contains(text(),'I rent')]")
    public WebElement iRent;
    @FindBy(xpath = "//div[contains(text(),'Other')]")
    public WebElement other;
    @FindBy(xpath = "//div[contains(text(),'I think I’m paying too much')]")
    public WebElement payMuch;
    @FindBy(xpath = "//div[contains(text(),'I’m buying a car soon')]")
    public WebElement buyCar;
    @FindBy(xpath = "//div[contains(text(),'A life event affected my policy')]")
    public WebElement myPolicy;
    @FindBy(xpath = "//div[contains(text(),'I’m just looking at my options')]")
    public WebElement myOptions;
    @FindBy(xpath = "//*[@id=/'dropdown-life_event-0/']/div/div[1]")
    public WebElement lifeEvent;
    @FindBy(xpath = "//span[contains(text(),'Save & continue')]")
    public WebElement saveAndContinue;

    //Select
    @FindBy(xpath = "//input[@name='garaging_address']")
    public WebElement garagingAddress;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//div[contains(text(),'Select state')]")
    public WebElement state;

    public WebElement selectRadioButton(String str) {
        radioButton = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + str + "')]"));
        return radioButton;
    }


}
