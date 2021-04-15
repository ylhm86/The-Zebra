package com.thezebra.pages;

import com.thezebra.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {


    @FindBy(xpath = "//span[contains(text(),'Save & continue')]")
    public WebElement saveAndContinue;

    @FindBy(xpath = "//input[@id='dropdown-input-vehicle-year-0']")
    public WebElement vehicleYear;

    @FindBy(xpath = "//input[@id='dropdown-input-vehicle-make-0']")
    public WebElement vehicleMake;

    @FindBy(xpath = "//input[@id='dropdown-input-vehicle-model-0']")
    public WebElement vehicleModel;

    @FindBy(xpath = "//input[@id='dropdown-input-vehicle-submodel-0']")
    public WebElement vehicleSubModel;

    @FindBy(xpath = "//input[@id='miles-0']")
    public WebElement estimatedMlage;

    @FindBy(xpath = "//input[@id='dropdown-input-mileagePeriod-0']")
    public WebElement frequency;
}
