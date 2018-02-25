package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features = {"features"},glue = {"cucumberPackage"})
public class TestRunner extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	@BeforeTest
	public void beforeTest() {	
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();  
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
