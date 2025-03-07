package Proxify_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topup {

	public static void main(String[] args) throws InterruptedException {
	
		// initilize the  chrome driver
				WebDriver driver = new ChromeDriver();
				
		// maxmize the window
				driver.manage().window().maximize();
				
		// url of website
		driver.get("https://proxify.gg/topup");
		
		driver.findElement(By.xpath("(//input[@id='amount'])[1]")).sendKeys("5");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Continue to Payment')])[1]")).click();
		
		

	}

}
