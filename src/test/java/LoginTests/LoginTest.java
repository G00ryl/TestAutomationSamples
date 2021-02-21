package LoginTests;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {
    SecureAreaPage secureAreaPage;


    @Test
    public void testSuccessfulLogin() {
        LoginPage login = homePage.clickFormAuthentication();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        secureAreaPage = login.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
