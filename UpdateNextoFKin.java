package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import aPPages.LaunchURL;

public class UpdateNextoFKin extends LogIn  {	
	

	public UpdateNextoFKin() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public  void changeKin () {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[2]/div/div[3]/p/span")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/section/section/div[2]")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/div[2]/div[6]/div[10]/div/input")).sendKeys("08065665666566");
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/div[2]/div[6]/button")).click();
		driver.quit();
	
	
	
	
	}
}
	

	

	

	
	

		
	

	
		
	




