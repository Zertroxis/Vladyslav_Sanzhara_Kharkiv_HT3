package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WacomPage extends BasePage {

    @FindBy(xpath = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart," +
            "'Монитор-планшет Wacom Cintiq 16 FHD (DTK-1660)')]")
    private WebElement findGraphTabletWacomDTK1660;

    public WacomPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnWacomDTK1660() {
        findGraphTabletWacomDTK1660.click();
    }
}
