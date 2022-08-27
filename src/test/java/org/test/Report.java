package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.CucumberSample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\",glue="org.step",plugin= {"json:src\\test\\resources\\Facebook\\fb2.json"})
public class Report {
	@AfterClass
public static void Report() {
	CucumberSample.Smple("src\\\\test\\\\resources\\\\Facebook\\\\fb2.json");
}
}
