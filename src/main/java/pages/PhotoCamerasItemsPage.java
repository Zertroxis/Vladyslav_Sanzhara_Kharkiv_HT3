package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoCamerasItemsPage extends BasePage {

    @FindBy(xpath = "//img[@src][@alt = 'Фотоаппараты']")
    private WebElement imgSourceOpenPageCameras;

    public PhotoCamerasItemsPage(WebDriver driver) {
        super(driver);
    }

    public void openCameras() {
        imgSourceOpenPageCameras.click();
    }
}
