package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterAccountPage extends Utility {

        By verifyAccount = By.xpath("//h1[contains(text(),'Register Account')]");
        By verifyReturning = By.xpath("//h2[contains(text(),'Returning Customer')]");
        By firstName = By.id("input-firstname");
        By lastName = By.id("input-lastname");
        By email = By.id("input-email");
        By telephone = By.name("telephone");
        By password = By.id("input-password");
        By passwordConfirm = By.name("confirm");
        By selectRadioButton = By.cssSelector("input[value='1'][name='newsletter']");
        By privacyPolicy = By.name("agree");
        By continueButton = By.xpath("//input[@value='Continue']");
        By verifyMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
        By clickButton = By.linkText("Continue");



        public String VerifyRegisterAccount(){
            return getTextFromElement(verifyAccount);
        }

        public String verifyReturningCustomer() {
            return getTextFromElement(verifyReturning);
        }

        public void enterFirstName(String text) {
            sendTextToElement(firstName,text);
        }

        public void enterLastName(String text){
            sendTextToElement(lastName,text);
        }

        public void enterEmail(String text){
            sendTextToElement(email,text);
        }

        public void enterTelephoneNumber(String text){
            sendTextToElement(telephone,text);
        }

        public void enterPassword(String text){
            sendTextToElement(password,text);
        }

        public void enterConfirmPassword(String text){
            sendTextToElement(passwordConfirm,text);
        }

        public void selectRadioYesButton(){
            clickOnElement(selectRadioButton);
        }

        public void clickOnPrivacyPolicy(){
            clickOnElement(privacyPolicy);
        }

        public void clickOnContinueButton(){
            clickOnElement(continueButton);
        }

        public String verifyTheMessage(){
            return getTextFromElement(verifyMessage);
        }

        public void setContinueButton(){
            clickOnElement(clickButton);


    }


}
