package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

        By productTitle = By.xpath("//div[@id='content']//h1");
        By qty = By.id("input-quantity");
        By addToCartButton = By.xpath("//button[@id='button-cart']");
        By greenBarNotification = By.xpath("//div[@class='alert alert-success alert-dismissible']");
        By shippingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
        By calendar = By.xpath("//i[@class='fa fa-calendar']");
        By calendarMonthAndYear = By.cssSelector("div[class='datepicker-days'] th[class='picker-switch']");
        By calendarNextButton = By.cssSelector("div[class='datepicker-days'] th[class='next']");
        By calendarAllDatesList = By.xpath("//tbody//tr/td[@class='day']");



        public String getProductTitle() {
            return getTextFromElement(productTitle);
        }

        public void cleatTextFromQty() {
            clearTextFromElement(qty);
        }

        public void sendTextToQty(String text) {
            sendTextToElement(qty, text);
        }

        public void clickOnAddToCart() {
            clickOnElement(addToCartButton);
        }
        public void waitForNotificationDisplay(){
            waitUntilVisibilityOfElementLocated(greenBarNotification,40);
        }

        public String getTextFromNotification() {
            return getTextFromElement(greenBarNotification);
        }

        public void clickOnShoppingCartLink() {
            clickOnElement(shippingCartLink);
        }

        public void clickOnCalendar() {
            clickOnElement(calendar);
        }

        public String getMonthAndYearText() {
            return getTextFromElement(calendarMonthAndYear);
        }

        public void clickOnCalendarNextButton() {
            clickOnElement(calendarNextButton);
        }
        public List<WebElement> getAllDatesFromCalendar(){
            return  getListOfElements(calendarAllDatesList);
}
    }

