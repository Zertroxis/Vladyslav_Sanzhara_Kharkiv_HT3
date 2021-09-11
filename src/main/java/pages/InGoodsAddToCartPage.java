package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InGoodsAddToCartPage extends BasePage{

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']")
    private WebElement openCartOnHeader;

    @FindBy(xpath = "//div[@class = 'item'][@data-productkey][@data-cart-id]")
    private List<WebElement> countAmountOfGoodsInCart;

    @FindBy(xpath = "//span[@class='name']")
    private WebElement nameOfElementInCart;

    public InGoodsAddToCartPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void clickOnCartOnHeader(){
        openCartOnHeader.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public int amountGoodsInCart(){
        return countAmountOfGoodsInCart.size();
    }

    public WebElement getNameOfElementInCart(){
        return nameOfElementInCart;
    }
}
