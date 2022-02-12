package App.Main;

import App.WebDriver.Web;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public void clickThis(By element){
        Web.getDriver().findElement(element).click();
    }
    public void enterField(By locator, String name){
        WebElement inIt = Web.getDriver().findElement(locator);
        inIt.clear();
        inIt.sendKeys(name);
    }
    public void waitAbit(){
        Web.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
