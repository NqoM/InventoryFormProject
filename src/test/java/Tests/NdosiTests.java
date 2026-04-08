package Tests;

import Pages.FormPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {



    //@Test(dependsOnMethods = "verifyHomePageIsDisplayed")
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
    public void verifyLoginPageIsDisplayed(){
        loginPage.verifyLoginPageIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "LoginPageScreenshot01");
    }

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayed")
    public void userSelectLearn() throws InterruptedException {
        homePage.selectLearnButton();
    }


    @Test(dependsOnMethods = "userSelectLearn")
    public void userSelectLearningMaterials() throws InterruptedException {
        homePage.selectLearningMaterials();
    }

    @Test(dependsOnMethods = "userSelectLearningMaterials")
    public void userSelectWebAutomationAdvance() throws InterruptedException {
        homePage.selectWebAutomationAdvance();
    }

    @Test(dependsOnMethods = "userSelectWebAutomationAdvance")
    public void userSelectDeviceType() throws InterruptedException {
        formPage.selectDeviceType();
    }

    @Test(dependsOnMethods = "userSelectDeviceType")
    public void userSelectBrand() throws InterruptedException {
        formPage.selectBrand();
    }

    @Test(dependsOnMethods = "userSelectBrand")
    public void userSelectStorage() throws InterruptedException {
        formPage.selectStorage();
    }

    @Test(dependsOnMethods = "userSelectStorage")
    public void userSelectColor() throws InterruptedException {
        formPage.selectColor();
    }

    @Test(dependsOnMethods = "userSelectColor")
    public void userEnterQuantity() throws InterruptedException {
        formPage.enterQuantity("2");

    }

    @Test(dependsOnMethods = "userEnterQuantity")
    public void userEnterAddress() throws InterruptedException  {
        formPage.enterAddress("123 James Street, Durban 4001");
    }

    @Test(dependsOnMethods = "userEnterAddress")
    public void userClickNextButton() throws InterruptedException {
        formPage.clickNextButton();
    }

    @Test(dependsOnMethods = "userClickNextButton")
    public void userSelectExpressShipping() throws InterruptedException {
        formPage.selectExpressShipping();
    }

    @Test(dependsOnMethods = "userSelectExpressShipping")
    public void userSelectOneYearWarranty() throws InterruptedException {
        formPage.selectOneYearWarranty();
    }

    @Test(dependsOnMethods = "userSelectOneYearWarranty")
    public void userAppliesDiscountCode() throws InterruptedException {
        formPage.applyDiscountCode("SAVE10");
    }

    @Test(dependsOnMethods = "userAppliesDiscountCode")
    public void userClickConfirmPurchase() throws InterruptedException  {
        formPage.clickConfirmPurchase();
    }

    @Test(dependsOnMethods = "userAppliesDiscountCode")
    public void userClickViewInvoice() throws InterruptedException  {
        formPage.clickViewInvoice();
    }

    @Test(dependsOnMethods = "userClickViewInvoice")
    public void userClickView() throws InterruptedException  {
        formPage.clickView();
    }


    @Test(dependsOnMethods = "userClickView")
    public void verifyInvoiceIsDisplayed() throws InterruptedException {
        formPage.verifyInvoiceIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "InvoiceScreenshot01");
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}

