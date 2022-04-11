package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(features="src/test/java/features",tags="@TestMe",

        glue={"stepDefinition"},
        monochrome=true
       )
	//tags="@testMe"
public class PatientLoginRunner {
	
}
