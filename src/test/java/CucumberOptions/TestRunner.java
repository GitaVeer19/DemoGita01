package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "C:/Users/veerg/Cucumber_Automation/Practice_Automation_01/src/test/java/Features", dryRun=true,monochrome=true,
		
		glue={"StepDefinations"}, stepNotifications = false, tags="@PortalTest",
		plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})
		

		//glue="StepDefinations",stepNotifications = false,tags="@MobileTest")

		 //glue="StepDefinations",stepNotifications = false,tags="@RegTest and @SmokeTest")
	  // glue="StepDefinations",stepNotifications = false,tags="not @SanityTest")

		//glue="StepDefinations",stepNotifications = false,tags="@SmokeTest or @RegTest")

        //glue="StepDefinations",stepNotifications = false,tags="@SmokeTest")

		//dryRun=false
		
public class TestRunner {

	
	
}
