package demo.tutorialsninja.com.pages;

import demo.tutorialsninja.com.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends Utility {

        By sortByDropDown = By.id("input-sort");
        By productHpLp3065 =By.linkText("HP LP3065");
        By productSonyVaio =By.linkText("Sony VAIO");
        By productMackBook = By.linkText("MacBook");
        By desktopProductList =By.xpath("//h4//a");
        By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
        By laptopAndNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
        By componentText = By.xpath("//h2[contains(text(),'Components')]");


        public void selectOptionFromSortByDropDown(String text) {
            selectByVisibleTextFromDropDown(sortByDropDown, text);
        }

        public void clickOnProductHPLP3065(){
            clickOnElement(productHpLp3065);
        }

        public void clickOnProductSonyVaio(){
            clickOnElement(productSonyVaio);
        }

        public void clickOnProductMackBook(){
            clickOnElement(productMackBook);
        }

        public List<WebElement> getDeskTopProductList(){
            return getListOfElements(desktopProductList);
        }

        public String getDeskTopText() {
            return getTextFromElement(desktopText);
        }

        public String getLaptopAndNotebookText() {
            return getTextFromElement(laptopAndNotebookText);
        }

        public String getComponentText() {
            return getTextFromElement(componentText);
}
    }

