package App.stepDefinition;

import App.Main.GooglePage.googlePage;
import cucumber.api.java.en.When;

public class testCaseOne {
    googlePage go = new googlePage();

    @When("^start google$")
    public void getIt(){
        go.startIt();
    }
    @When("^get page name$")
    public void getName(){
        go.getName();
    }
    @When("^enter in search '(.+)'$")
    public void enterName(String name){
        go.searchName(name);
    }

}
