package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"/Users/pooja.shilimkar/eclipse-workspace/CucumberPractice/src/test/resources/AppFeature"},
		glue= {"com.stepdefination","AppHooks"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				,"rerun:target/rerun.txt"}
	
		
		)


public class MyTestRunner {

}
					