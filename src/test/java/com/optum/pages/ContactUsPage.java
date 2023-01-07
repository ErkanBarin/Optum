package com.optum.pages;

import com.optum.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    public ContactUsPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[.='Get patient support']")
    public WebElement patientSupport;


}
