package by.itacademy.pavelaponik.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BugRedTest extends BaseTest {
    @Test
    public void testBugRedGetText() {

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
    @Test
    public void testBugRedFillInTheFormOfRegistration() {

        BugRedPage bugRedPage = new BugRedPage(driver);

        bugRedPage.openBugRedPage();
        bugRedPage.inputName();
        bugRedPage.inputEmail();
        bugRedPage.inputPassword();
        bugRedPage.clickOnButtonRegistrate();

        String actualTextNameAfterRegistration = bugRedPage.getTextNameAfterRegistration();

        Assertions.assertEquals(bugRedPage.NAME_AFTER_REGISTRATION_EXPECTED, actualTextNameAfterRegistration );
    }


    @Test
    public void testBugRedFillInTheFormWithInvalidDataEmail() {

        BugRedPage bugRedPage = new BugRedPage(driver);

        bugRedPage.openBugRedPage();
        bugRedPage.inputName();
        bugRedPage.inputInvalidEmail();
        bugRedPage.inputPassword();
        bugRedPage.clickOnButtonRegistrate();

        String actualTextErrorAfterRegistrationWithInvalidEmail = bugRedPage.getTextEmailAfterInvalidEmailRegistration();

        Assertions.assertEquals(bugRedPage.INVALID_EMAIL_EXPECTED, actualTextErrorAfterRegistrationWithInvalidEmail );
    }


}
