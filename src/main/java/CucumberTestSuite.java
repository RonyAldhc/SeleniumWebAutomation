import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        tags = {"@open"}
//        features = "src/test/resources/features/Barracuda"
)
public class CucumberTestSuite {



}
