package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Login.feature",
glue ="StepDefinations"
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
