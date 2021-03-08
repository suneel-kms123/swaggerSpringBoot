import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "not @ignore",
        extraGlue = {"com.uk.sprint.rest"},
        features = "src/cucumber/resources/features"
)
public class CucumberTestRunner {

}
