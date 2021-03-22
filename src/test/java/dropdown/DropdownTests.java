//package dropdown;
//
//import base.BaseTests;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class DropdownTests extends BaseTests {
//    @Test
//    public void testSelectOption(){
//        var dropDownPage = homePage.clickDropDown();
//
//        String option = "Option 1";
//        dropDownPage.selectFromDropDown("Option 1");
//        List<String> selectedOtions = dropDownPage.getSelectedOptions();
//        assertEquals(selectedOtions.size(),1,"Incorrect number of Selections");
//        assertTrue(selectedOtions.contains(option), "Option not selected");
//    }
//}
