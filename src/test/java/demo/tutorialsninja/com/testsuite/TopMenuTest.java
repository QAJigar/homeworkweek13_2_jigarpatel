package demo.tutorialsninja.com.testsuite;

import demo.tutorialsninja.com.pages.HomePage;
import demo.tutorialsninja.com.pages.ProductListPage;
import demo.tutorialsninja.com.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends BaseTest {

        HomePage homePage = new HomePage();
        ProductListPage productListPage = new ProductListPage();

        /**
         * This method with name "selectMenu" it has one parameter name "menu" of type string
         * This method should click on the menu whatever name is passed as parameter.
         */
        public void selectMenu(String menu) {
            List<WebElement> menuList = homePage.getAllMenuOptions();
            try {
                for (WebElement menuOption : menuList) {
                    if (menuOption.getText().equalsIgnoreCase(menu)) {
                        menuOption.click();
                    }
                }
            } catch (StaleElementReferenceException e) {
                menuList = homePage.getAllMenuOptions();
            }
        }

        /**
         * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
         * 1.1 Mouse hover on “Desktops” Tab and click
         * 1.2 call selectMenu method and pass the menu = “Show All Desktops”
         * 1.3 Verify the text ‘Desktops’
         */
        @Test
        public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
            //1.1 Mouse hover on “Desktops” Tab and click
            homePage.mouseHoverOnDeskTopsAndClick();
            //1.2 call selectMenu method and pass the menu = “Show All Desktops”
            selectMenu("Show All Desktops");
            //1.3 Verify the text ‘Desktops’
            Assert.assertEquals(productListPage.getDeskTopText(), "Desktops", "Not navigate to desktop page");
        }

        /**
         * 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
         * 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
         * 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
         * 2.3 Verify the text ‘Laptops & Notebooks’
         */
        @Test
        public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
            //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
            homePage.mouseHoverOnLaptopsAndNotebooksAndClick();
            //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
            selectMenu("Show All Laptops & Notebooks");
            //2.3 Verify the text ‘Laptops & Notebooks’
            Assert.assertEquals(productListPage.getLaptopAndNotebookText(), "Laptops & Notebooks", "Not navigate to Laptops and Notebooks page");
        }

        /**
         * 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
         * 3.1 Mouse hover on “Components” Tab and click
         * 3.2 call selectMenu method and pass the menu = “Show All Components”
         * 3.3 Verify the text ‘Components’
         */
        @Test
        public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
            //3.1 Mouse hover on “Components” Tab and click
            homePage.mouseHoverOnComponentsAndClick();
            //3.2 call selectMenu method and pass the menu = “Show All Components”
            selectMenu("Show All Components");
            //3.3 Verify the text ‘Components’
            Assert.assertEquals(productListPage.getComponentText(), "Components", "Not navigate to components page");


    }
}
