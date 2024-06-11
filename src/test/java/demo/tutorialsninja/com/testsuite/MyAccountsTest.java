package demo.tutorialsninja.com.testsuite;

import demo.tutorialsninja.com.pages.AccountPage;
import demo.tutorialsninja.com.pages.HomePage;
import demo.tutorialsninja.com.pages.RegisterAccountPage;
import demo.tutorialsninja.com.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyAccountsTest extends BaseTest {

        HomePage homePage = new HomePage();
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        AccountPage accountPage = new AccountPage();

        //* 1.1 create method with name "selectMyAccountOptions" it has one parameter name"option" of type string
        // * 1.2 This method should click on the options whatever name is passed as parameter.
        // * (Hint: Handle List of Element and Select options)

        public void selectMyAccountOptions(String option) {
            List<WebElement> optionList = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li/a"));
            for (WebElement e : optionList) {
                //System.out.println(e.getText());
                if (e.getText().equalsIgnoreCase(option)) {
                    e.click();
                    break;
                }
            }
        }

        //* Write the following test
        // * 1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
        @Test
        public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
            //1.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
            selectMyAccountOptions("Register");
            //1.3 Verify the text “Register Account”.
            String expectedText = "Register Account";
            String actualText = registerAccountPage.VerifyRegisterAccount();
            Assert.assertEquals(actualText, expectedText, "Error Message Not Displayed");
        }

        //     2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
        @Test
        public void verifyUserShouldNavigateToLoginPageSuccessfully() {
            // * 2.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            // * 2.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
            selectMyAccountOptions("Login");
            // * 2.3 Verify the text “Returning Customer”.
            String expectedText1 = "Returning Customer";
            String actualTest1 = registerAccountPage.verifyReturningCustomer();
            Assert.assertEquals(actualTest1, expectedText1, "Error Message Not Displayed");
        }

        //3. Test name verifyThatUserRegisterAccountSuccessfully()
        @Test
        public void verifyThatUserRegisterAccountSuccessfully() {
            // * 3.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            // * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
            selectMyAccountOptions("Register");
            // * 3.3 Enter First Name
            registerAccountPage.enterFirstName("Elona");
            // * 3.4 Enter Last Name
            registerAccountPage.enterLastName("Shah");
            // * 3.5 Enter Email
            registerAccountPage.enterEmail("Elonashah123@gmail.com");
            // * 3.6 Enter Telephone
            registerAccountPage.enterTelephoneNumber("09898989898");
            // * 3.7 Enter Password
            registerAccountPage.enterPassword("Elonashah123");
            // * 3.8 Enter Password Confirm
            registerAccountPage.enterConfirmPassword("Elonashah123");
            // * 3.9 Select Subscribe Yes radio button
            registerAccountPage.selectRadioYesButton();
            // * 3.10 Click on Privacy Policy check box
            registerAccountPage.clickOnPrivacyPolicy();
            // * 3.11 Click on Continue button
            registerAccountPage.clickOnContinueButton();
            // * 3.12 Verify the message “Your Account Has Been Created!”
            Assert.assertEquals(registerAccountPage.verifyTheMessage(), "Your Account Has Been Created!", "Text Not Match");
            // * 3.13 Click on Continue button
            registerAccountPage.setContinueButton();
            // * 3.14 Click on My Account Link.
            accountPage.clickOnAccountLink();
            // * 3.15 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
            selectMyAccountOptions("Logout");
            // * 3.16 Verify the text “Account Logout”
            Assert.assertEquals(accountPage.VerifyAccountLogout(), "Account Logout", "Text Not Match");
            // * 3.17 Click on Continue button
            accountPage.setClickOnAccount();
        }

        //    * 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
        @Test
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
            // * 4.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            // * 4.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
            selectMyAccountOptions("Login");
            // * 4.3 Enter Email address
            registerAccountPage.enterEmail("Elonashah123@gmail.com");
            // * 4.4 Enter Last Name
            //There is No Field
            // * 4.5 Enter Password
            registerAccountPage.enterPassword("Elonashah123");
            // * 4.6 Click on Login button
            registerAccountPage.clickOnContinueButton();
            // * 4.7 Verify text “My Account”
            Assert.assertEquals(accountPage.getVerifyText(),"My Account", "Text Not Match");
            // * 4.8 Click on My Account Link.
            accountPage.clickOnAccountLink();
            // * 4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
            selectMyAccountOptions("Logout");
            // * 4.10 Verify the text “Account Logout”
            Assert.assertEquals(accountPage.VerifyAccountLogout(), "Account Logout", "Text Not Match");
            // * 4.11 Click on Continue button
            accountPage.setClickOnAccount();

    }

}
