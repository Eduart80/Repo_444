package App.Main.GooglePage;

import App.Main.BasePage;
import App.WebDriver.Web;
import org.openqa.selenium.By;

public class googlePage extends BasePage {


    By searchBar = By.id("input");


    public void startIt(){
        waitAbit();
        String m = Web.getDriver().getTitle();
        System.out.println("the page name is: "+ m);
    }

    public void getName(){
        waitAbit();
        clickThis(searchBar);
    }

    public void searchName(String name){
        waitAbit();
        enterField(searchBar, name);
    }

}
