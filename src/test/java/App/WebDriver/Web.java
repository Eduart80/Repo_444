package App.WebDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    private static WebDriver driver;



    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver","./chrome/chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://www.worldometers.info/world-population/");
       // driver.get("https://google.com/");
//        driver.get("https://https://www.indeed.com/?from=gnav-homepage/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
