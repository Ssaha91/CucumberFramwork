package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/site/cucumber-pretty",
                "junit:target/cucumber.xml",
                "json:target/cucumber.json"},

        features = "src/test/java/features/account.feature",
        glue = "steps"
)
public class LoginRunner {
}
