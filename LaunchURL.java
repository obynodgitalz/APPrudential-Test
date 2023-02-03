package aPPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	
	protected WebDriver driver;

	@SuppressWarnings("deprecation")
	public LaunchURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\obinna.agubuche\\\\eclipse-workspace\\\\MelloTest\\\\Drivers\\\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		
		driver.get(" https://oasis-investor-dev.africaprudential.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
}
