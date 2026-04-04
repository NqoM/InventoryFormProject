package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement verify_homePage;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement LearnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement LearningMaterials;

    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement WebAutomationAdvance;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickLoginButton() {
        loginButton.click();
    }

    public void verifyHomePageIsDisplayed() {
        verify_homePage.isDisplayed();
    }

    public void clickLearnButton() throws InterruptedException {
        Thread.sleep(5000);
        LearnButton.click();
    }

    public void clickLearningMaterials() throws InterruptedException {
        LearningMaterials.click();
        Thread.sleep(2000);
    }

    public void clickWebAutomationAdvance() throws InterruptedException {
        WebAutomationAdvance.click();
        Thread.sleep(2000);
    }

}


