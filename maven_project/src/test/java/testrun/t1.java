package testrun;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/l1.feature",glue={"testdefination"},
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports/a1.html",
"json:target/cucumber-reports/a1.json"}		
)
public class t1 {

}
