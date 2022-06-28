import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void OnePage() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Hub URL and Run Conditions for the Router
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.20.23:4444"),capabilities);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Chinmoy Jana");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
