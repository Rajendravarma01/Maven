package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//plugin or format
//html:foldername
//json :folderName/fileName.json
//junit : foldeeranme/fileName.xml
//pretty 
@RunWith(Cucumber.class)
@CucumberOptions (features="OrangeHRMFeature/Demo.feature",glue="",plugin= {"html:Result","pretty"},monochrome=true)

public class runnerClass1 {
	

}
