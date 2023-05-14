import com.bmi.calculator.BMICalculatorPage;
import com.bmi.utilities.UtilDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BMICalculator {

    @BeforeTest
    public static void setUp(){
        UtilDriver.setUpDriver();
    }

    @AfterTest
    public static void tearDown(){
        UtilDriver.getDriver().quit();
    }

    @Given("the user in a BMI Calculator page")
    public static void the_User_Is_In_BMICalculator_Page(){
        UtilDriver.getDriver().get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
    }

    @When("he enters {String}")
    public static void he_Enters_Weight(String weight){
        BMICalculatorPage.setWeightKilograms(weight);
    }

    @And("he enters {String}")
    public static void he_Enters_Height(String height){
        BMICalculatorPage.setHeightField(height);
    }

    @And("he calculates")
    public static void he_Clicks_The_Button_Calculate(){
        BMICalculatorPage.pressCalculate();
    }

    @Then("Expected result must be {String} / {String}")
    public static void verify_Correct_Category(String bmiIndex, String bmiCategory){
        String verifier = bmiIndex + bmiCategory;
        String actualValues = BMICalculatorPage.getBmiValue() + BMICalculatorPage.getBmiCategory();
        Assert.assertEquals(verifier, actualValues);
    }

}
