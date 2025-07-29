package Amazon.driver;

import Amazon.Enums.ConfigProperties;
import Amazon.exceptions.BrowserInvocationFailedException;
import Amazon.factory.DriverFactory;
import Amazon.utils.PropertyUtils;
import java.net.MalformedURLException;
import java.util.Objects;

/**
 * Driver class is responsible for invoking and closing the browser.
 *
 * <p>
 * It is also responsible for
 * setting the driver variable to DriverManager which handles the thread safety for the
 * webdriver instance.<p>
 *
 * <pre>Checking Whether it is formatted correctly </pre>
 *
 * Jan 20, 2021 <p>
 * @author Amuthan Sakthivel
 * @version 1.0
 * @since 1.0
 * @see DriverManager
 * @see Amazon.tests.BaseTest
 */

public final class Driver {

    /**
     * Private constructor to avoid external instantiation
     */
     private Driver() {}

    /**
     * Gets the browser value and initialise the browser based on that
     *
     * @author Amuthan Sakthivel
     * Jan 20,2021
     * @param browser Value will be passed from{@link Amazon.tests.BaseTest}. Values can be chrome and firefox
     * TODO WebDriverManager implementation
     */

    public static void initDriver(String browser, String version)   {
        //TODO --> Why executable were not needed when executing in remote
        if(Objects.isNull(DriverManager.getDriver())) {
            try {
                DriverManager.setDriver(DriverFactory.getDriver(browser,version));
            } catch (MalformedURLException e) {
                throw new BrowserInvocationFailedException("Please check the capabilities of browser");
            }
          DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
        }
    }

    /**
     * Terminates the browser instance.
     * Sets the threadlocal to default value, i.e null.
     * @author Amuthan Sakthivel
     * Jan 22, 2021
     */

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}