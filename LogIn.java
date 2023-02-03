package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import aPPages.LaunchURL;

public class LogIn extends LaunchURL  {	
	

	public LogIn() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public  void validLogin () {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/nav/div[3]/a[1]")).click();
		driver.findElement(By.id("email")).sendKeys("test@qa.team");
		driver.findElement(By.id("password")).sendKeys("@Password1");
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div/form/div[1]/div[4]/button")).click();
		
	
	
	
	
	}
}
	

	

	

	
	

		
	

	
		
	




