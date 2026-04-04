package Tests;

import Pages.FormPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail("nqoh@gmail.com");
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() {
        loginPage.enterPassword("@12345678");
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void userClicksLearnButton() throws InterruptedException {
        homePage.clickLearnButton();
    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void verifyLoginPageIsDisplayed(){
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "userClicksLearnButton")
    public void userClicksLearningMaterials() throws InterruptedException {
        homePage.clickLearningMaterials();
    }

    @Test(dependsOnMethods = "userClicksLearningMaterials")
    public void userClicksWebAutomationAdvance() throws InterruptedException {
        homePage.clickWebAutomationAdvance();
    }

    @Test(dependsOnMethods = "userClicksWebAutomationAdvance")
    public void userClicksDevice() throws InterruptedException {
        formPage.clickDevice();
    }

    @Test(dependsOnMethods = "userClicksDevice")
    public void userClicksBrand() throws InterruptedException {
        formPage.clickBrand();
    }

    @Test(dependsOnMethods = "userClicksBrand")
    public void userClicksStorage() throws InterruptedException {
        formPage.clickStorage();
    }

    @Test(dependsOnMethods = "userClicksStorage")
    public void userClicksColor() throws InterruptedException {
        formPage.clickColor();
    }







    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}

