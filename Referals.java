package Proxify_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Referals {

	public static void main(String[] args) {
		
		// initilize the  chrome driver
				WebDriver driver = new ChromeDriver();
				
				// maxmize the window
				driver.manage().window().maximize();
				
				// url of website
				driver.get("https://proxify.gg/referrals");
				
				// clicking the claim
				driver.findElement(By.xpath("(//button[normalize-space()='Claim'])[1]")).click();
				
				

	}

}
