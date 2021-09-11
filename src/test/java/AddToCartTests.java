import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest {

    private static final String WACOM_SEARCH_KEYWORD = "wacom";
    private static final String IPAD_SEARCH_KEYWORD = "ipad";
    private static final String CONTAINS_TEXT_SONYA7M2 = "Фотоаппарат Sony Alpha 7M2 + объектив 28-70 KIT (ILCE7M2KB.CEC)";

    @Test(priority = 3)
    public void checkTwoElementsWacomAndIpadAddedInCart() {
        getHomePage().searchByKeyword(WACOM_SEARCH_KEYWORD);
        getHomePage().waitForPageLoadComplete(10);
        getWacomPage().clickOnWacomDTK1660();
        getHomePage().waitVisibilityOfElement(20, getInGoodsAddToCartPage().getAddToCartPopup());
        getInGoodsAddToCartPage().clickOnContinueShoppingButton();
        getHomePage().searchByKeyword(IPAD_SEARCH_KEYWORD);
        getHomePage().waitForPageLoadComplete(10);
        getIpadPage().clickOnAppleIpadAir2019MUUT2();
        getHomePage().waitVisibilityOfElement(20, getInGoodsAddToCartPage().getAddToCartPopup());
        getInGoodsAddToCartPage().clickOnContinueShoppingButton();
        getHomePage().goToPageHeader();
        getInGoodsAddToCartPage().clickOnCartOnHeader();
        Assert.assertEquals(getInGoodsAddToCartPage().amountGoodsInCart(), 2);
    }

    @Test(priority = 4)
    public void checkToCartCameraSonyA7() {
        getHomePage().clickOnCatalogButton();
        getHomePage().clickOnAndOpenCameraPageButton();
        getHomePage().waitForPageLoadComplete(10);
        getPhotoCamerasItemsPage().openCameras();
        getHomePage().waitForPageLoadComplete(10);
        getPhotoCamerasPage().clickOnFilterSony();
        getPhotoCamerasPage().openSonyA7M2();
        getHomePage().waitForPageLoadComplete(10);
        getSonyA7M2Page().addToCartSonyA7M2();
        getHomePage().waitVisibilityOfElement(20, getInGoodsAddToCartPage().getAddToCartPopup());
        Assert.assertTrue(getInGoodsAddToCartPage().getNameOfElementInCart().getText().contains(CONTAINS_TEXT_SONYA7M2));
    }
}
