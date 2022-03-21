import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    private WebElement linkMyAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    private WebElement linkLogin;

    @FindBy(css = ".product-thumb .fa-shopping-cart")
    private WebElement addToCard;

    @FindBy(className = "alert-dismissible")
    public WebElement successAlert;

    public HomePage( WebDriver driver){
        super(driver);
    }


    void clickLinkMyAccount(){
        linkMyAccount.click();
    }
    void clickLogin(){
        linkLogin.click();
    }

    void clickAddToCard(){
        addToCard.click();
    }
}
