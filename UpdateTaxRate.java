package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import aPPages.LaunchURL;

public class UpdateTaxRate extends LogIn  {	
	

	public UpdateTaxRate() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public  void changeTaxRates () {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[2]/div/div[3]/p/span")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/section/section/div[3]")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/div[2]/div[2]/div[2]/div[9]/div[5]/div[4]/div/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/div[2]/div[2]/div[2]/div[9]/div[6]/button")).click();
		driver.quit();	
	
	
	
	}
}
	

	

	

	
	

		
	

	
		
	




