package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SonyA7M2Page extends BasePage {

    @FindBy(xpath = "//div[@class='about-prod__center']//a[@class='main-btn main-btn--green main-btn--large'][contains(@data-ecomm-cart, 'Фотоаппарат Sony Alpha')]")
    private WebElement addToCartSonyA7M2;

    public SonyA7M2Page(WebDriver driver) {
        super(driver);
    }

    public void addToCartSonyA7M2(){
        addToCartSonyA7M2.click();
    }

}
