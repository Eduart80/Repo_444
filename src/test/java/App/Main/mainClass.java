package App.Main;


import App.WebDriver.Web;

public class mainClass  extends Web{

    public static void DD() {

    String a = Web.getDriver().getTitle();
    System.out.println("emri i faqes " + a);
    }

}

