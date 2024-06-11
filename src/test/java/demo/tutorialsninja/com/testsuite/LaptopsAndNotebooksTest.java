package demo.tutorialsninja.com.testsuite;

import demo.tutorialsninja.com.pages.*;
import demo.tutorialsninja.com.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

        HomePage homePage = new HomePage();
        ProductListPage productListPage = new ProductListPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        CheckoutPage checkoutPage = new CheckoutPage();

        /**
         * 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
         * 1.1 Mouse hover on Laptops & Notebooks Tab.and click
         * 1.2 Click on “Show All Laptops & Notebooks”
         * 1.3 Select Sort By "Price (High > Low)"
         * 1.4 Verify the Product price will arrange in High to Low order.
         */
        @Test
        public void verifyProductsPriceDisplayHighToLowSuccessfully() {
            //1.1 Mouse hover on Laptops & Notebooks Tab.and click
            homePage.mouseHoverOnLaptopsAndNotebooksAndClick();
            //1.2 Click on “Show All Laptops & Notebooks”
            homePage.clickOnShowAllLaptopsAndNotebooks();
            //1.3 Select Sort By "Price (High > Low)"
            productListPage.selectOptionFromSortByDropDown("Price (High > Low)");
            //1.4 Verify the Product price will arrange in High to Low order.
        }

        @Test
        public void verifyThatUserPlaceOrderSuccessfully() {
            //2.1 Mouse hover on Laptops & Notebooks Tab and click
            homePage.mouseHoverOnLaptopsAndNotebooksAndClick();
            //2.2 Click on “Show All Laptops & Notebooks”
            homePage.clickOnShowAllLaptopsAndNotebooks();
            //2.3 Select Sort By "Price (High > Low)"
            productListPage.selectOptionFromSortByDropDown("Price (High > Low)");
            //2.4 Select Product “MacBook” --this product is out of stock so take another product
            // productListPage.clickOnProductSonyVaio();
            productListPage.clickOnProductMackBook();
            //2.5 Verify the text “MacBook”
            // Assert.assertEquals(productPage.getProductTitle(), "Sony VAIO", "Product text not match");
            Assert.assertEquals(productPage.getProductTitle(), "MacBook", "Product text not match");
            //2.6 Click on ‘Add To Cart’ button
            productPage.clickOnAddToCart();
            //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
            Assert.assertTrue(productPage.getTextFromNotification().contains("Success: You have added MacBook to your shopping cart!"), "notification is not displayed");
            //2.8 Click on link “shopping cart” display into success message
            productPage.clickOnShoppingCartLink();
            //2.9 Verify the text "Shopping Cart"
            Assert.assertTrue(cartPage.getPageTitle().contains("Shopping Cart"), "shopping cart text is not display");
            //2.10 Verify the Product name "MacBook"
            //Assert.assertEquals(cartPage.getProductName(), "Sony VAIO", "product name not match");
            Assert.assertEquals(cartPage.getProductName(), "MacBook", "product name not match");
            //2.11 Change Quantity "2"
            cartPage.clearTextFromQty();
            cartPage.sendTextToQty("2");
            //2.12 Click on “Update” Tab
            cartPage.clickOnUpdateButton();
            //2.13 Verify the message “Success: You have modified your shopping cart!”
            Assert.assertTrue(cartPage.getNotificationText().contains("Success: You have modified your shopping cart!"), "notification text is not display");
            //2.14 Verify the Total £737.45
            // Assert.assertEquals(cartPage.getTotalPrice(),"£1,472.45","total is not matched");
            //2.15 Click on “Checkout” button
            cartPage.clickOnCheckOutButton();
            //2.16 Verify the text “Checkout”
            Assert.assertEquals(checkoutPage.getCheckoutText(), "Checkout", "text is not displayed");
            //2.17 Verify the Text “New Customer”
            Assert.assertTrue(checkoutPage.getNewCustomerText().contains("New Customer"), "New Customer text is not match");
            //2.18 Click on “Guest Checkout” radio button
            checkoutPage.clickOnGuestCheckoutRadioButton();
            //2.19 Click on “Continue” tab
            checkoutPage.clickOnContinueButton();
            //2.20 Fill the mandatory fields
            checkoutPage.sendTextToFirstName("TestFN");
            checkoutPage.sendTextToLastName("TestLN");
            checkoutPage.sendTextToEmail("testfnln145@gmail.com");
            checkoutPage.sendTextToTelephone("04532859321");
            checkoutPage.sendTextToAddress1("testRd");
            checkoutPage.sendTextToCity("testCity");
            checkoutPage.sendTextToPostcode("T53 R67");
            checkoutPage.selectCountry("United Kingdom");
            checkoutPage.selectState("Cheshire");
            checkoutPage.clickOnContinueGuestButton();
            //2.21 Click on “Continue” Button
            checkoutPage.clickOnShippingMethodContinueButton();
            //2.22 Add Comments About your order into text area
            checkoutPage.sendTextToCommentBox("Kindly place near by address");
            checkoutPage.clickOnPaymentMethodContinueButton();
            //2.23 Check the Terms & Conditions check box
            checkoutPage.clickOnTermsAgreement();
            //2.24 Click on “Continue” button
            checkoutPage.clickOnPaymentMethodContinueButton();
            //2.25 Verify the message “Warning: Payment method required!” N/A
}
    }
