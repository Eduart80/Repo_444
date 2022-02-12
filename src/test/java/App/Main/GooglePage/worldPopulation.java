package App.Main.GooglePage;

import App.Main.BasePage;
import App.WebDriver.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;
import java.util.List;

public class worldPopulation extends BasePage {

    By peopleCount = By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']");



    public void getList() {
        int count = 1;
        while (count <= 20) {
            System.out.println(count + "seconds");
            if(count==20) break;

            List<WebElement> listOfNumb = Web.getDriver().findElements(peopleCount);
            for (WebElement e : listOfNumb) {
                System.out.println(e.getText());
            }

            count++;
        }

    }
}
