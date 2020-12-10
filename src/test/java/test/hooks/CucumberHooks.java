package test.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.pages.PageObject;

public class CucumberHooks extends PageObject {

    @Before
    public void beforeTest (){
        System.out.println("Start Test");
        //getDriver().getTitle();
    }

    @After
    public void afterTest () {
        System.out.println("Finish Test");
        getDriver().quit();
    }
}
