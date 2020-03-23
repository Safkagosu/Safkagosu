package Cucumber_demo.Cucumber_demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "junit:target/surefire-reports/TESTRunCukesTest.xml", "html:target/cucumber", "json:target/cucumber.json" }, 
		monochrome = true, 
		features = { "classpath:src/test/java/resourses/feature" }, 
		glue = { "classpath:src/test/java/Cucumber_demo/Cucumber_demo" },
		tags = { "@run, @Siarhei" }
		)
	public class RunCukesTest {
	}

