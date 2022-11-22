package testsuit;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Before
    public void setUp(){
        openBrowser(baseUnit);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        sendTextToElement(By.name("username"),"Admin");
        sendTextToElement(By.name("password"),"admin123");
        clickOnElement(By.xpath("//button[@type ='submit']"));
        String expectedM="Dashboard";
        Assert.assertEquals(expectedM,getTextFromElement(By.xpath("//h6[normalize-space()='Dashboard']")));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
