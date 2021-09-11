import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {


    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public IpadPage getIpadPage() {
        return new IpadPage(getDriver());
    }

    public InGoodsAddToCartPage getInGoodsAddToCartPage() {
        return new InGoodsAddToCartPage(getDriver());
    }

    public PhotoCamerasItemsPage getPhotoCamerasItemsPage() {
        return new PhotoCamerasItemsPage(getDriver());
    }

    public SamsungPage getSamsungPage() {
        return new SamsungPage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public WacomPage getWacomPage() {
        return new WacomPage(getDriver());
    }

    public PhotoCamerasPage getPhotoCamerasPage() {
        return new PhotoCamerasPage(getDriver()); }

    public SonyA7M2Page getSonyA7M2Page() {
        return new SonyA7M2Page(getDriver()); }
}
