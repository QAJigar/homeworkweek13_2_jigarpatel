package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

        By checkOutText = By.cssSelector("div[id='content'] h1");
        By newCustomerText = By.cssSelector("body div[id='checkout-checkout'] div[class='row'] div[class='row'] div:nth-child(1) h2:nth-child(1)");
        By guestCheckoutRadioButton = By.xpath("//input[@value='guest']");
        By continueButton = By.id("button-account");
        By firstName = By.id("input-payment-firstname");
        By lastName = By.id("input-payment-lastname");
        By email = By.id("input-payment-email");
        By telephone = By.id("input-payment-telephone");
        By address1 = By.id("input-payment-address-1");
        By city = By.id("input-payment-city");
        By postcode = By.id("input-payment-postcode");
        By country = By.id("input-payment-country");
        By state = By.id("input-payment-zone");
        By continueGuestButton = By.id("button-guest");
        By commentBox = By.xpath("//div[@id='collapse-payment-method']//textarea[@name='comment']");
        By shippingMethodContinueButton = By.xpath("//input[@id='button-shipping-method']");
        By termsAgreementCheckBox = By.xpath("//input[@name='agree']");
        By paymentMethodContinueButton =By.xpath("//input[@id='button-payment-method']");
        public String getCheckoutText() {
            return getTextFromElement(checkOutText);
        }

        public String getNewCustomerText() {
            return getTextFromElement(newCustomerText);
        }

        public void clickOnGuestCheckoutRadioButton() {
            clickOnElement(guestCheckoutRadioButton);
        }

        public void clickOnContinueButton() {
            clickOnElement(continueButton);
        }

        public void sendTextToFirstName(String text) {
            sendTextToElement(firstName, text);
        }

        public void sendTextToLastName(String text) {
            sendTextToElement(lastName, text);
        }

        public void sendTextToEmail(String text) {
            sendTextToElement(email, text);
        }

        public void sendTextToTelephone(String text) {
            sendTextToElement(telephone, text);
        }

        public void sendTextToAddress1(String text) {
            sendTextToElement(address1, text);
        }

        public void sendTextToCity(String text) {
            sendTextToElement(city, text);
        }

        public void sendTextToPostcode(String text) {
            sendTextToElement(postcode, text);
        }

        public void selectCountry(String text) {
            selectByVisibleTextFromDropDown(country, text);
        }

        public void selectState(String text) {
            selectByVisibleTextFromDropDown(state, text);
        }

        public void clickOnContinueGuestButton() {
            clickOnElement(continueGuestButton);
        }

        public void sendTextToCommentBox(String text) {
            sendTextToElement(commentBox, text);
        }

        public void clickOnShippingMethodContinueButton() {
            clickOnElement(shippingMethodContinueButton);
        }

        public void clickOnTermsAgreement() {
            clickOnElement(termsAgreementCheckBox);
        }

        public void clickOnPaymentMethodContinueButton(){
            clickOnElement(paymentMethodContinueButton);
}


    }
