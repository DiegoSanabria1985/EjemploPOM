package com.demoqa.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import com.demoqa.models.DataInjections;
import com.demoqa.pageobjects.PracticeFormPage;
import com.demoqa.utils.Javascript;
import com.demoqa.utils.Times;
import com.demoqa.utils.UploadPicture;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class PracticeFormPageSteps {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    DataInjections dataInjections = new DataInjections();

    @Step
    public void openBrowser(){
        practiceFormPage.open();
    }

    @Step
    public void completeForm() throws InterruptedException {
        practiceFormPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);
        practiceFormPage.sendfirstName(dataInjections.getUsername());
        practiceFormPage.sendlastName(dataInjections.getLastname());
        practiceFormPage.sendemail(dataInjections.getEmail());
        Times.waitFor(2000);
        Javascript.clickJS(practiceFormPage.getDriver(), practiceFormPage.genderCheck);
        practiceFormPage.sendmobileNumber(dataInjections.getNumber());
        Javascript.clickJS(practiceFormPage.getDriver(), practiceFormPage.hobbies);
        Times.waitFor(2000);
        practiceFormPage.sendPicture(UploadPicture.filePath(dataInjections.getFileImput()));
        Times.waitFor(7000);
        practiceFormPage.sendAddres(dataInjections.getAddres());
        Times.waitFor(8000);
        Javascript.clickJS(practiceFormPage.getDriver(), practiceFormPage.submit);
        Times.waitFor(5000);
        Javascript.clickJS(practiceFormPage.getDriver(), practiceFormPage.close);
        Times.waitFor(5000);

    }
}
