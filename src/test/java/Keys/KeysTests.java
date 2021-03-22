package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressessPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressessPage keyPage = homePage.clicKeyPressess();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        KeyPressessPage keyPage = homePage.clicKeyPressess();
        keyPage.enterPi();
    }
}
