package tests;

import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

        LoginPage loginPage;

        @BeforeClass
        public void setUpTest() {
            setup();
            loginPage = new LoginPage(page);
        }

        @Test
        public void validLoginTest() {
            loginPage.login("standard_user", "secret_sauce");

            System.out.println("Page Title: " + loginPage.getTitle());
        }

        @AfterClass
        public void cleanUp() {
            tearDown();
        }
}
