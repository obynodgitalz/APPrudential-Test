package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import aPPages.LaunchURL;

public class UpdateBank extends LogIn  {	
	

	public UpdateBank() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	
	public  void changeBank () {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/main/section/section/div[1]/div[4]/div[2]/div[2]/div/div[3]/p/span")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/section/section/div[5]")).click();
		driver.findElement(By.xpath("//*[@id="root"]/section/div/div/main/section/section/section/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id="modal-root"]/div[2]/div/div/div[3]/label/div/div/div[2]/div/svg")).sendkeys("Access Money");
		driver.findElement(By.Id("accountNo")).sendkeys("1221222455");
		driver.findElement(By.xpath("//*[@id="modal-root"]/div[2]/div/div/div[4]/button[2]")).click();
		driver.quit();
		

	
	
	
	
	}
}
	

	

	

	
	

		
	

	
		
	




