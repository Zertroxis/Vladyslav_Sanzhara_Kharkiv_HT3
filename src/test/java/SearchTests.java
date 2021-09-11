import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

        private static final String CONTAINS_WORD_ON_PAGE_SAMSUNG = "Samsung";

    @Test(priority = 1)
    public void checkThatPageContainsTextSamsung() {
        getHomePage().samsungShortcutHomePageButton();
        getHomePage().waitForPageLoadComplete(10);
        Assert.assertTrue(getSamsungPage().getSamsungArticleHeaderOfSmartphones()
                .getText().contains(CONTAINS_WORD_ON_PAGE_SAMSUNG));
    }

    @Test(priority = 2)
    public void checkElementsAmountOfSamsungGoodsFromShortcut(){
        getHomePage().samsungShortcutHomePageButton();
        getHomePage().waitForPageLoadComplete(10);
        Assert.assertEquals(getSearchResultPage().getSearchResultsCount(), 34);
    }

}
