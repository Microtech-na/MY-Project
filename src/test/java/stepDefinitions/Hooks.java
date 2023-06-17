package stepDefinitions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends Base {
	@Before
	public void setup() throws MalformedURLException {
		ChromeOptions opt = new ChromeOptions();
		
		 driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);

	}



  @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
        }
    }
		
	
	
}
