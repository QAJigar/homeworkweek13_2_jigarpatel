package demo.tutorialsninja.com.testsuite;

import demo.tutorialsninja.com.pages.CartPage;
import demo.tutorialsninja.com.pages.HomePage;
import demo.tutorialsninja.com.pages.ProductListPage;
import demo.tutorialsninja.com.pages.ProductPage;
import demo.tutorialsninja.com.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {
        HomePage homePage = new HomePage();
        ProductListPage productListPage = new ProductListPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        @Test
        public void verifyProductArrangeInAlphaBaticalOrder() {
            // 1.1 Mouse hover on Desktops Tab.and click
            homePage.mouseHoverOnDeskTopsAndClick();
            // 1.2 Click on “Show All Desktops”
            homePage.clickOnShowAllDesktops();
            //product list before filtering
            List<WebElement> productList = productListPage.getDeskTopProductList();
            List<String> productNameBeforeSort = new ArrayList<>();
            for (WebElement p : productList) {
                productNameBeforeSort.add(p.getText());
            }
            // Sort By Reverse order
            Collections.reverse(productNameBeforeSort);

            // 1.3 Select Sort By position "Name: Z to A"
            productListPage.selectOptionFromSortByDropDown("Name (Z - A)");
            // After filter Z -A Get all the products name and stored into array list
            List<WebElement> productListAfterSort = productListPage.getDeskTopProductList();
            List<String> productNameAfterSort = new ArrayList<>();
            for (WebElement p : productListAfterSort) {
                productNameAfterSort.add(p.getText());
            }
            // 1.4 Verify the Product will arrange in Descending order.
            Assert.assertEquals(productNameAfterSort, productNameBeforeSort, "product are not sorted in descending (Z-A) order");
        }

        @Test
        public void verifyProductAddedToShoppingCartSuccessFully() {
            //2.1 Mouse hover on Currency Dropdown and click
            homePage.mouseHoverOnCurrencyMenuAndClick();
            //2.2 Mouse hover on £Pound Sterling and click
            homePage.mouseHoverOnPoundSterlingAndClick();
            //2.3 Mouse hover on Desktops Tab.
            homePage.mouseHoverOnDeskTopsAndClick();
            //2.4 Click on “Show All Desktops”
            homePage.clickOnShowAllDesktops();
            //2.5 Select Sort By position "Name: A to Z"
            productListPage.selectOptionFromSortByDropDown("Name (A - Z)");
            //2.6 Select product “HP LP3065”
            productListPage.clickOnProductHPLP3065();
            //2.7 Verify the Text "HP LP3065"
            String expectedText = "HP LP3065";
            String actualText = productPage.getProductTitle();
            Assert.assertEquals(actualText, expectedText, "HP LP3065 product is not displayed");
            //2.8 Select Delivery Date "2023-11-27"
            selectDeliveryDate("2023", "November", "27");
            //2.9.Enter Qty "1” using Select class.
            productPage.cleatTextFromQty();
            productPage.sendTextToQty("1");
            //2.10 Click on “Add to Cart” button
            productPage.clickOnAddToCart();
            //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
            expectedText = "Success: You have added HP LP3065 to your shopping cart!";
            actualText = productPage.getTextFromNotification();  //replace("×", "").trim();
            Assert.assertTrue(actualText.contains(expectedText), "Product not added to cart");
            //2.12 Click on link “shopping cart” display into success message
            productPage.clickOnShoppingCartLink();
            //2.13 Verify the text "Shopping Cart"
            // System.out.println(cartPage.getPageTitle());
            Assert.assertTrue(cartPage.getPageTitle().contains("Shopping Cart"), "Shopping cart text is not displayed");
            //2.14 Verify the Product name "HP LP3065"
            expectedText = "HP LP3065";
            actualText = cartPage.getProductName();
            Assert.assertEquals(actualText, expectedText, "Product name is not matched");
            //2.15 Verify the Delivery Date "2023-11-27"
            // Assert.assertEquals(cartPage.getDeliveryDateText(), "2023-11-27", "DeliverData is not matched");
            // Assert.assertTrue(cartPage.getDeliveryDateText().contains("2023-11-27"),"Deliver date is incorrect");
            //2.16 Verify the Model "Product 21"
            Assert.assertEquals(cartPage.getProductModel(), "Product 21", "model is not matched");
            //2.17 Verify the Total "£74.73"
            Assert.assertEquals(cartPage.getTotalPrice(), "£74.73", "total price is incorrect");
        }

        //select Deliver Date Method
        public void selectDeliveryDate(String year, String month, String date) {
            //click on calendar
            productPage.clickOnCalendar();
            while (true) {
                String monthAndYear = productPage.getMonthAndYearText();
                String arr[] = monthAndYear.split("");
                String mon = arr[0];
                String yer = arr[1];
                if (mon.equalsIgnoreCase(month) && year.equalsIgnoreCase(year)) {
                    break;
                } else {
                    productPage.clickOnCalendarNextButton();
                }
            }

            //select Date
            List<WebElement> allDates = productPage.getAllDatesFromCalendar();
            for (WebElement dt : allDates) {
                if (dt.getText().equals(date)) {
                    dt.click();
                    break;
                }

}
    }

}
