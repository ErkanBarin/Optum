package com.optum.step_definitions;

import com.optum.pages.ContactUsPage;
import com.optum.pages.HomePage;
import com.optum.utilities.ConfigurationReader;
import com.optum.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class PatientSupport_definition extends HomePage {

    JavascriptExecutor js=(JavascriptExecutor)Driver.get();

    @Given("the client is on homepage")
    public void the_client_is_on_homepage() {
        Driver.get().get(ConfigurationReader.getProperty("url"));


    }
    @When("the client scrolls down")
    public void sheScrollsDown() {
        js.executeScript("arguments[0].scrollIntoView(true)",contactUs);
    }
    @And("clicks on Contact Us page")
    public void clicks_on_contact_us_page() {

        js.executeScript("arguments[0].click()",contactUs);

        }


    @Then("chooses Optum Care patient support")
    public void chooses_optum_care_patient_support() {
        ContactUsPage contactUsPage=new ContactUsPage();
        contactUsPage.patientSupport.click();
        Assert.assertEquals("Patient Support | Optum",Driver.get().getTitle());
    }


}
