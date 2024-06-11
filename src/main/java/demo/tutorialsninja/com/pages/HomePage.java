package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By accountLink = By.xpath("//span[contains(text(),'My Account')]");
    By desktopLink = By.linkText("Desktops");
    By showAllDeskTopLink = By.linkText("Show AllDesktops");
    By currencyMenu = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.cssSelector("button[name='GBP']");
    By allOptions = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By laptopAndNoteBooksMenu = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebooks = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    By allMenus = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By componentsLink = By.linkText("Components");


    public void clickOnMyAccount(){
        clickOnElement(accountLink);
    }

    public void mouseHoverOnDeskTopsAndClick() {
        mouseHoverToElementAndClick(desktopLink);
    }

    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDeskTopLink);
    }

    public void mouseHoverOnCurrencyMenuAndClick() {
        mouseHoverToElementAndClick(currencyMenu);
    }

    public void mouseHoverOnPoundSterlingAndClick() {
        mouseHoverToElementAndClick(poundSterling);
    }

    public List<WebElement> getAllOptions() {
        return getListOfElements(allOptions);
    }

    public void mouseHoverOnLaptopsAndNotebooksAndClick() {
        mouseHoverToElementAndClick(laptopAndNoteBooksMenu);
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public List<WebElement> getAllMenuOptions(){
        return  getListOfElements(allMenus);
    }

    public void mouseHoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(componentsLink);
}

}
