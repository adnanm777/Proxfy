package Proxify_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class plans {

	public static void main(String[] args) throws InterruptedException {
		
		// initilize the  chrome driver
				WebDriver driver = new ChromeDriver();
				
				// maxmize the window
				driver.manage().window().maximize();
				
				// url of website
				driver.get("https://proxify.gg/dashboard");

				driver.findElement(By.xpath("(//a[normalize-space()='Plans'])[1]")).click();
				
				Thread.sleep(2000);
				
				//driver.findElement(By.xpath("(//div[contains(@class,'flex items-center gap-2')][normalize-space()='Buy Now'])[1]")).click();
				
	}

}
