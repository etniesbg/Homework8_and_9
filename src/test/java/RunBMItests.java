import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "progress", "html:target/cucumber-html-report" },
        features = "src/test/resources",
        tags = "@regression")
public class RunBMItests extends AbstractTestNGCucumberTests {
    public RunBMItests(){

    }
}