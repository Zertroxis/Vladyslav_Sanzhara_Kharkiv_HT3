package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@class ='container-main']/article[@class ='brand__item']")
    private List<WebElement> allSamsungElementsOnPage;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultsCount() {
        return amountOfAllSamsungGoodsOnPage().size();
    }

    public List<WebElement> amountOfAllSamsungGoodsOnPage(){
        return allSamsungElementsOnPage;
    }
}
