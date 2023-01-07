package com.optum.pages;

import com.optum.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {
    public HomePage() {PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//span[.='Contact us']/..")
    public WebElement contactUs;


}
