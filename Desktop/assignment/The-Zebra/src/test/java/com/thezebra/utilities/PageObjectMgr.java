package com.thezebra.utilities;

import org.openqa.selenium.support.PageFactory;

public class PageObjectMgr {

    static Object currentPage;

    public static Object getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(String pageNm) throws Exception {
        currentPage = PageFactory.initElements(Driver.getDriver(), Class.forName("com.thezebra.pages" + "." + pageNm));

    }
}