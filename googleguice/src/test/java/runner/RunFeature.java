package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"com.google.guice.learning.stepdef"},
        features = {"src/test/resources"})
public class RunFeature {
}