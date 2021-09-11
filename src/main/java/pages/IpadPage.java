package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IpadPage extends BasePage{

    @FindBy(xpath = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart," +
            "'Apple iPad Air 2019 Wi-Fi 256GB Gold (MUUT2)')]")
    private WebElement findAppleIpadAir2019MUUT2;

    public IpadPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleIpadAir2019MUUT2(){
        findAppleIpadAir2019MUUT2.click();
    }
}
