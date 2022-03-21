import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage{
    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputPassword;

    @FindBy(css = "input[value='Login']")
    private  WebElement buttonLogin;

    @FindBy( xpath = "//*[@id=\"content\"]/h2[1]")
    public WebElement contentForAssert;

    public LoginPage( WebDriver driver ) {
        super(driver);
    }

    public void fillEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void fillPassword(String value){
        inputPassword.sendKeys(value);
    }
    public void clickLogin(){
        buttonLogin.click();
    }
}
