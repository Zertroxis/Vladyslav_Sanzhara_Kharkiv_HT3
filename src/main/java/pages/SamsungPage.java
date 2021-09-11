package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.By.xpath;

public class SamsungPage extends BasePage {

    @FindBy(xpath = "//div[@id = 'Смартфоны'][@class]")
    private WebElement samsungHeaderArticleForSmartphones;;

    public SamsungPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSamsungArticleHeaderOfSmartphones() {
        return samsungHeaderArticleForSmartphones;
    }
}
