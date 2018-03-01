package lesson7;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        AssertEquals("TestNG is working fine", str);
    }

    private void AssertEquals(String testNG_is_working_fine, String str) {
    }

}
