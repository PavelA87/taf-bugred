package by.itacademy.pavelaponik.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BugRedTest extends BaseTest {
    @Test
    public void testBugRed() {

        BugRedPage bugRedPage = new BugRedPage(driver);

        bugRedPage.openBugRedPage();
        String actualTextName = bugRedPage.getTextName();
        String actualTextEmail = bugRedPage.getTextEmail();
        String actualTextPassword = bugRedPage.getTextPassword();
        String actualTextRegister = bugRedPage.getTextRegister();
        String actualTextRegistration = bugRedPage.getTextRegistration();

        Assertions.assertEquals(bugRedPage.NAME_EXPECTED, actualTextName);
        Assertions.assertEquals(bugRedPage.EMAIL_EXPECTED, actualTextEmail);
        Assertions.assertEquals(bugRedPage.PASSWORD_EXPECTED, actualTextPassword);
        Assertions.assertEquals(bugRedPage.REGISTER_EXPECTED, actualTextRegister);
        Assertions.assertEquals(bugRedPage.REGISTRATION_EXPECTED, actualTextRegistration);


    }
}
