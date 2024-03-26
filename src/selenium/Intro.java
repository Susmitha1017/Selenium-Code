package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Intro {
	public static void main(String[] args)throws Throwable {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		  driver.findElement(By.name("email")).sendKeys("ginjupalli.susmitha@gmail.com");
		    driver.findElement(By.name("pass")).sendKeys("Nandhu@1017");
		    driver.findElement(By.name("login")).click();
		    

	         Thread.sleep(3000); 

		    driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		    Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[normalize-space()='Log Out'])[1]")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();		
	}
}
