package com.bmi.calculator;

import com.bmi.utilities.UtilDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BMICalculatorPage {
    private static final By HEIGHT_FIELD = new By.ById("heightCMS");
    private static final By WEIGHT_KILOGRAMS = new By.ById("weightKg");
    private static final By CALCULATE_BUTTON = new By.ById("Calculate");
    private static final By YOUR_BMI_IS_FIELD = new By.ById("bmi");
    private static final By BMI_CATEGORY_FIELD = new By.ById("bmi_category");

    public static void setHeightField(String inputHeight){
        UtilDriver.getDriver().findElement(HEIGHT_FIELD).clear();
        UtilDriver.getDriver().findElement(HEIGHT_FIELD).sendKeys(inputHeight);
    }

    public static void setWeightKilograms(String inputWeight){
        UtilDriver.getDriver().findElement(WEIGHT_KILOGRAMS).clear();
        UtilDriver.getDriver().findElement(WEIGHT_KILOGRAMS).sendKeys(inputWeight);
    }

    public static void pressCalculate(){
        UtilDriver.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(CALCULATE_BUTTON));
        UtilDriver.getDriver().findElement(CALCULATE_BUTTON).click();
    }

    public static String getBmiValue(){
        return UtilDriver.getDriver().findElement(YOUR_BMI_IS_FIELD).getText();
    }

    public static String getBmiCategory(){
        return UtilDriver.getDriver().findElement(BMI_CATEGORY_FIELD).getText();
    }
}
