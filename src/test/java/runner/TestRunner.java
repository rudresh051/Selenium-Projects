package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\login\\login1.feature"
, glue="step_definitions")

public class TestRunner extends AbstractTestNGCucumberTests {

}
