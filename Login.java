package Proxify_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		// initilize the  chrome driver
		WebDriver driver = new ChromeDriver();
		
		// maxmize the window
		driver.manage().window().maximize();
		
		// url of website
		driver.get("https://proxify.gg/login");
		
		// userrname
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("tester@gmail.com");
		
		// password
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("6Xw5gf51Z39n");
		
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		
	}

}
