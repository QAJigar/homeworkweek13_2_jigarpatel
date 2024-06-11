package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {

        By shoppingCartText = By.xpath("//div[@id='content']//h1");
        By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
        By deliverDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
        By modelName = By.xpath("//td[normalize-space()='Product 21']");
        By totalPrice = By.xpath("//tbody//tr//td[6]");
        By qty = By.xpath("//input[contains(@name, 'quantity')]");
        By updateButton = By.xpath("//button[@data-original-title='Update']");
        By notificationText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
        By checkoutButton =By.xpath("//a[contains(text(),'Checkout')]");

        public String getPageTitle() {
            return getTextFromElement(shoppingCartText);
        }

        public String getProductName() {
            return getTextFromElement(productNameText);
        }

        public String getDeliveryDateText() {
            return getTextFromElement(deliverDateText);
        }

        public String getProductModel() {
            return getTextFromElement(modelName);
        }

        public String getTotalPrice() {
            return getTextFromElement(totalPrice);
        }

        public void clearTextFromQty() {
            clearTextFromElement(qty);
        }

        public void sendTextToQty(String text) {
            sendTextToElement(qty, text);
        }

        public void clickOnUpdateButton() {
            clickOnElement(updateButton);
        }

        public String getNotificationText() {
            return getTextFromElement(notificationText);
        }

        public void clickOnCheckOutButton(){
            clickOnElement(checkoutButton);
}

    }
