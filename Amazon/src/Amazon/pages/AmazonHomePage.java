package Amazon.pages;

import Amazon.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class AmazonHomePage  extends BasePage {

    @FindBy(xpath = "//div[@class='nav-left']/a")
    private WebElement linkHamburger;

    public AmazonHomePage() {
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    public AmazonHamburgerMenuPage clickHamburger() {

        //try new code design pattern.
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(linkHamburger)).click();
        //linkHamburger.click();
        return new AmazonHamburgerMenuPage();
    }
}
