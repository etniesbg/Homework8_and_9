import com.bmi.calculator.BMICalculatorPage;
import com.bmi.utilities.UtilDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BMICalculator {

    @BeforeTest
    public static void setUp(){
        UtilDriver.setUpDriver();
        UtilDriver.getDriver().get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
    }

    @AfterTest
    public static void tearDown(){
        UtilDriver.getDriver().quit();
    }

    @Given("the user in a BMI Calculator page")
    public static void the_User_Is_In_BMICalculator_Page(){
//        UtilDriver.setUpDriver();
//        UtilDriver.getDriver().get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
    }

    @When("he enters weights {string}")
    public static void he_Enters_Weight(String weights1){
        BMICalculatorPage.setWeightKilograms(weights1);
    }

    @And("he enters heights {string}")
    public static void he_Enters_Height(String heights1){
        BMICalculatorPage.setHeightField(heights1);
    }

    @And("he calculates")
    public static void he_Clicks_The_Button_Calculate(){
        BMICalculatorPage.pressCalculate();
    }

    @Then("Expected BMI index must be {string}")
    public static void verify_Correct_BMI_Index(String bmiIndex){
        String verifier = bmiIndex;
        String actualValues = BMICalculatorPage.getBmiValue();
        Assert.assertEquals(verifier, actualValues);
    }

    @Then("Expected BMI Category must be {string}")
    public static void verify_Correct_BMI_Category(String bmiCategory){
        String verifier = bmiCategory;
        String actualValues = BMICalculatorPage.getBmiCategory();
        Assert.assertEquals(verifier, actualValues);
    }
}
