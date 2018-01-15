package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomeDepotPage {

    private WebDriverWait wait;

    public HomeDepotPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }
    @FindBy (name = "q")
    WebElement searchField;

    @FindBy (id = "headerMyAccount")
    WebElement myAccBox;

    @FindBy (xpath = "//p[@id='authSignIn']//span[contains(text(), 'Sign in')]")
    WebElement signBox;

    @FindBy(id = "email_id")
    WebElement inputEmailBox;

    @FindBy(id = "password")
    WebElement inputPasswordBox;

    @FindBy(xpath = "//button[@id='accountSignIn']//span")
    WebElement signInBttn;

    @FindBy(id = "headerMyAccountTitle")
    WebElement welcome;

    public void CheckTitle(){
        searchField.click();
    }
    public void goToMyAccount() {
        wait.until(elementToBeClickable(myAccBox));
        myAccBox.click();
        wait.until(elementToBeClickable(signBox));
        signBox.click();
    }
    public void sendCredentials(){
        wait.until(elementToBeClickable(signInBttn));
        inputEmailBox.sendKeys("saha4311@gmail.com");
        inputPasswordBox.sendKeys("Gadhi171717*");
        signInBttn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isUserLogIn(){
        wait.until(visibilityOf(welcome));
        if (welcome.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }


}
