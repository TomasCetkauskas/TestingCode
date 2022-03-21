import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    HomePage HomePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);
    WaitUnits waitUnits = new WaitUnits();


    @Test
    void UserCanLogin() {
        HomePage.clickLinkMyAccount();
        HomePage.clickLogin();
        loginPage.fillEmail("testas@testas.com");
        loginPage.fillPassword("testasTestas123");
        loginPage.clickLogin();
        Assertions.assertEquals("My Account", loginPage.contentForAssert.getText());
        Assertions.assertTrue(myAccountPage.isMyAccountDisplayed());
    }

    @Test
    void UserCanAddToCard(){
        HomePage.clickAddToCard();
        WaitUnits.waitForElement(driver, HomePage.successAlert);
        Assertions.assertEquals("Success: You have added MacBook to your shopping cart!\n" +
                "×", HomePage.successAlert.getText());


    }
}
