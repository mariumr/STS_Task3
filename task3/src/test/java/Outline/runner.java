package Outline;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",tags= "@selectRow,@login" , glue= {"Outline"},
monochrome = true ,
//plugin = {"pretty","json:target/JSONReports/report.json"}
plugin = {"pretty","html:target/HTMLReports/report.html"}
//plugin = {"pretty" , "junit:target/XMLReports/report.xml"}
)
public class runner {

}
