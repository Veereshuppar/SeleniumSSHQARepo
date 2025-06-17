package com.sgtesting.driverscript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FeatureFiles",
        glue ="com.sgtesting.actiTime.stepdefinations")
public class DriverScript extends AbstractTestNGCucumberTests {
}
