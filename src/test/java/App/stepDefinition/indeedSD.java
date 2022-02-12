package App.stepDefinition;

import App.Main.indeed.indeedFirstPage;
import cucumber.api.java.en.When;

public class indeedSD {
    indeedFirstPage ind = new indeedFirstPage();

    @When("^start$")
    public void star(){
        System.out.println("kot");
    }



}
