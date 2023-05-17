import com.bmi.utilities.UtilDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

@CucumberOptions(plugin = { "progress", "html:target/cucumber-html-report" },
        features = "src/test/resources",
        tags = "@regression" )
public class RunBMItests extends AbstractTestNGCucumberTests {
    public RunBMItests() {

        }

}