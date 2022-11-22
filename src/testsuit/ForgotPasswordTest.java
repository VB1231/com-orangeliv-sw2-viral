package testsuit;

import browsefactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
@Before
    public void setUp(){
    openBrowser(baseUnit);
}
@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
clickOnElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
String expectedM1="Reset Password";
    Assert.assertEquals(expectedM1,getTextFromElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")));
}
}
