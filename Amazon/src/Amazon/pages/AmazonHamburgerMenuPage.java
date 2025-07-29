package Amazon.pages;


import Amazon.driver.DriverManager;
import Amazon.utils.DynamicXpathUtils;
import Amazon.Enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class AmazonHamburgerMenuPage extends BasePage {


    private String linkComputer ="//div[text()='Mobiles, Computers']/parent::a";
   // private String linkSubMenu =  "//div[contains(@class,'hmenu-item')]//a[contains(text(),'%s')]";
     private String linkSubMenu="//a[text()='%s']";

    private static final Duration SCROLL_DELAY = Duration.ofSeconds(10);
    private static final Duration WAIT_TIMEOUT = Duration.ofSeconds(10);

    public AmazonHamburgerMenuPage clickComputer() {
        click(By.xpath(linkComputer),WaitStrategy.CLICKABLE,"Mobiles and Computer");
        return this;
    }

    //this method design by testing mini byte.
    public AmazonLaptopPage clickOnSubMenuItem(String menutext){
        String newxpath= DynamicXpathUtils.getXpath(linkSubMenu,menutext);


        //Scrolling function and add wait
       WebElement element = DriverManager.getDriver().findElement(By.xpath(newxpath));

        new Actions(DriverManager.getDriver())
                .moveToElement(element)
                .pause(Duration.ofSeconds(2))
                .perform();

        new WebDriverWait(DriverManager.getDriver(), WAIT_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(element));

        click(By.xpath(newxpath), WaitStrategy.CLICKABLE,menutext);

        if(menutext.equalsIgnoreCase("Tablets")){
            return new AmazonLaptopPage();
        }
        return null;
    }

    //Amazon a Scrolling a bug ache.
}
