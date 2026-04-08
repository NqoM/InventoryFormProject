package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    WebDriver driver;

    //@FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    //WebElement deviceField;
    @FindBy(xpath = "//*[@id=\"deviceType\"]")
    WebElement deviceTypeDropdown;

    @FindBy(xpath = "//*[@id=\"brand\"]")
    WebElement brandDropdown;

    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")
    WebElement storageOption;

    @FindBy(xpath = "//*[@id=\"color\"]")
    WebElement colorDropdown;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement quantityField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(xpath = "//*[@id=\"inventory-next-btn\"]")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"shipping-express\"]")
    WebElement shippingMethod;

    @FindBy(xpath = "//*[@id=\"warranty-option-1yr\"]")
    WebElement warrantyOption;

    @FindBy(xpath = "//*[@id=\"discount-code\"]")
    WebElement discountCodeField;

    @FindBy(xpath = "//*[@id=\"apply-discount-btn\"]")
    WebElement applyButton;

    @FindBy(xpath = "//*[@id=\"purchase-device-btn\"]")
    WebElement confirmPurchaseButton;

    @FindBy(xpath = "//*[@id=\"view-history-btn\"]")
    WebElement viewInvoiceButton;

    @FindBy(xpath = "//*[@id=\"view-invoice-INV-1775609961100\"]")
    WebElement viewButton;





    public FormPage(WebDriver driver) {
        this.driver = driver;
    }


    public void selectDeviceType() throws InterruptedException {
        Select selectDeviceType = new Select(deviceTypeDropdown);
        selectDeviceType.selectByIndex(1);
        Thread.sleep(3000);
    }

    public void selectBrand() throws InterruptedException {
        Select selectBrand = new Select(brandDropdown);
        selectBrand.selectByIndex(1);
        Thread.sleep(3000);
    }

    public void selectStorage() throws InterruptedException {
        storageOption.click();
        Thread.sleep(3000);
    }

    public void selectColor() throws InterruptedException {
        Select selectColor = new Select(colorDropdown);
        selectColor.selectByIndex(3);
        Thread.sleep(3000);
    }


    public void enterQuantity(String quantity) throws InterruptedException {
        quantityField.sendKeys(quantity);
        Thread.sleep(2000);
    }

    public void enterAddress(String address) throws InterruptedException {
        addressField.sendKeys(address);
        Thread.sleep(2000);
    }

    public void clickNextButton() throws InterruptedException {
        nextButton.click();
        Thread.sleep(2000);
    }

    public void selectExpressShipping() throws InterruptedException {
        shippingMethod.click();
        Thread.sleep(3000);
    }

    public void selectOneYearWarranty() throws InterruptedException {
        warrantyOption.click();
        Thread.sleep(3000);
    }

    public void applyDiscountCode(String code) throws InterruptedException {
        discountCodeField.sendKeys(code);
        applyButton.click();
        Thread.sleep(5000);
    }

    public void clickConfirmPurchase() throws InterruptedException {
        confirmPurchaseButton.click();
        Thread.sleep(2000);
    }

    public void clickViewInvoice() throws InterruptedException {
        viewInvoiceButton.click();
        Thread.sleep(2000);
    }

    public void clickView() throws InterruptedException {
        viewButton.click();
        Thread.sleep(5000);
    }



}

