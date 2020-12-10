package test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features",
        tags = {"@featureOpen"}
//        features = "src/test/resources/features/Barracuda"
)
public class CucumberTestSuite {



}
