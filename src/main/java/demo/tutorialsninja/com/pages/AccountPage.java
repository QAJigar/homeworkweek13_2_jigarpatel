package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnAccount = By.xpath("//span[contains(text(),'My Account')]");
    By verifyAccount = By.xpath("//h1[contains(text(),'Account Logout')]");
    By getClickOnAccount = By.xpath("//a[contains(text(),'Continue')]");
    By verifyText = By.xpath("//h2[contains(text(),'My Account')]");

    public void clickOnAccountLink(){
        clickOnElement(clickOnAccount);
    }

    public String VerifyAccountLogout(){
        return getTextFromElement(verifyAccount);
    }

    public void setClickOnAccount(){
        clickOnElement(getClickOnAccount);
    }

    public String getVerifyText(){
        return getTextFromElement(verifyText);
}


}
