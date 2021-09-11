package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoCamerasPage extends BasePage{

    @FindBy(xpath = "//label[@for='fltr-proizvoditel-sony']")
    private WebElement filterForSony;

    @FindBy(xpath = "//div[@class='prod-cart__descr' and contains(text(), 'Фотоаппарат Sony Alpha 7M2 + объектив 28-70 KIT (ILCE7M2KB.CEC)')]")
    private WebElement sonyA7M2;

    public PhotoCamerasPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFilterSony(){
        filterForSony.click();
    }

    public void openSonyA7M2(){
        sonyA7M2.click();
    }
}
