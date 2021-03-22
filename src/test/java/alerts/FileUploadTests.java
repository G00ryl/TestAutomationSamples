package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\banan\\IdeaProjects\\TestAutomationSamples\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(),"chromedriver.exe","Uploaded went wrong");
    }
}
