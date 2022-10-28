package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "G:\\Sel_New\\Sel@9.30AM(EST)\\workspace\\CucumberFW\\src\\main\\java\\features"
		,glue={"stepDefinations"}
		,dryRun=false
		,plugin= {"pretty","json:target/myReports/report.json"
		,"junit:target/myReports/report.xml"}
		
		)
public class TestRuner {

}
