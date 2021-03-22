package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        AlertPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert", "Result text incorrect");
    }
}
