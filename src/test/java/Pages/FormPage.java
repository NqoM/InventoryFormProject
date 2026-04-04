package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement deviceField;

    @FindBy(xpath = "//*[@id=\"brand\"]/option[2]")
    WebElement brandField;

    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")
    WebElement storage;

    @FindBy(xpath = "//*[@id=\"color\"]/option[4]")
    WebElement colorField;

    @FindBy(id = "quantity")
    WebElement quantityField;


    public FormPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickDevice() throws InterruptedException {
        deviceField.click();
        Thread.sleep(3000);
    }

    public void clickBrand() throws InterruptedException {
        brandField.click();
        Thread.sleep(3000);
    }

    public void clickStorage() throws InterruptedException {
        storage.click();
        Thread.sleep(3000);
    }

    public void clickColor() throws InterruptedException {
        colorField.click();
        Thread.sleep(3000);
    }

    public void clickQuantity() throws InterruptedException {
        colorField.click();
        Thread.sleep(3000);
    }



}

