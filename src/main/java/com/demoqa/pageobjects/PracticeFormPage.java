package com.demoqa.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticeFormPage extends PageObject {

    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public By genderCheck = By.id("gender-radio-1");
    public By mobileNumberInput = By.id(("userNumber"));
    public By dateBirthInput = By.id("dateOfBirthInput");
    public By selectPicture = By.id("uploadPicture");
    public By submit = By.id("submit");
    public By picture = By.id("uploadPicture");
    public By close = By.id("closeLargeModal");
    public By addres = By.id("currentAddress");
    public By hobbies = By.id("hobbies-checkbox-1");


    public void sendfirstName(String string){
        getDriver().findElement(firstNameInput).sendKeys(string);
    }
    public void sendlastName(String string){
        getDriver().findElement(lastNameInput).sendKeys(string);
    }
    public void sendemail(String string){
        getDriver().findElement(emailInput).sendKeys(string);
    }
    public void sendmobileNumber(String string){
        getDriver().findElement(mobileNumberInput).sendKeys(string);
    }
    public void sendPicture(String string){getDriver().findElement(picture).sendKeys(string);}
    public void sendAddres(String string){getDriver().findElement(addres).sendKeys(string);}



}
