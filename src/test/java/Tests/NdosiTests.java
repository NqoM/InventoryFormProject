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
    public void verifyLoginPageIsDisplayed(){
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayed")
    public void userSelectLearnButton() throws InterruptedException {
        homePage.selectLearnButton();
    }


    @Test(dependsOnMethods = "userSelectLearnButton")
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
    public void userClickConfirmPurchaseButton() throws InterruptedException  {
        formPage.clickConfirmPurchase();
    }

    @Test(dependsOnMethods = "userAppliesDiscountCode")
    public void userClickViewInvoiceButton() throws InterruptedException  {
        formPage.clickViewInvoice();
    }

    @Test(dependsOnMethods = "userClickViewInvoiceButton")
    public void userClickView() throws InterruptedException  {
        formPage.clickView();
    }



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}

