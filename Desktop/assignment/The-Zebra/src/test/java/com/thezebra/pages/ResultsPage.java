package com.thezebra.pages;

import com.thezebra.utilities.BasePage;
import com.thezebra.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends BasePage {

    public ResultsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
