package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'https://avic.ua/foto-video')]")
    private WebElement photoCamerasPageButton;

    @FindBy(xpath = "//div[@class = 'partner-box height']/a[@href = '/brand-samsung']")
    private WebElement samsungShortcutHomePageButton;

    @FindBy(tagName = "header")
    private WebElement header;

    @FindBy(xpath = "html")
    private WebElement forClickOnPage;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void samsungShortcutHomePageButton(){
        samsungShortcutHomePageButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
        searchInput.clear();
    }

    public void goToPageHeader(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", header);;
    }

    public void clickOnCatalogButton(){
        productCatalogButton.click();
    }

    public void clickOnAndOpenCameraPageButton(){
        photoCamerasPageButton.click();
    }
}
