import com.bmi.calculator.BMICalculatorPage;
import com.bmi.utilities.UtilDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.*;

public class BMICalculator {

    @BeforeMethod
    public static void setUp(){
        UtilDriver.setUpDriver();
        UtilDriver.getDriver().get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
    }

//    @AfterMethod
//    public static void tearDown(){
//        UtilDriver.getDriver().quit();
//    }

    @Given("he enters heights {string}")
    public static void he_Enters_Height(String inputHeight){
        BMICalculatorPage.setHeightField(inputHeight);
    }


    @When("he enters weights {string}")
    public static void he_Enters_Weight(String inputWeight){
        BMICalculatorPage.setWeightKilograms(inputWeight);
    }

    @And("he calculates")
    public static void he_Calculates(){
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
