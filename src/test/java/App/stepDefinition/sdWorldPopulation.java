package App.stepDefinition;

import App.Main.GooglePage.worldPopulation;
import cucumber.api.java.en.When;

public class sdWorldPopulation {
    worldPopulation wp = new worldPopulation();

    @When("^go to webpage, find how many people we are$")
    public void goTo() {
        wp.getList();
    }

}
