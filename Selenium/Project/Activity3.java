import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
	public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new FirefoxDriver();

	        // Maximize window
	        driver.manage().window().maximize();

	        // Open OrangeHRM login page
	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Enter username
	        driver.findElement(By.name("username")).sendKeys("Admin");

	        // Enter password
	        driver.findElement(By.name("password")).sendKeys("admin123");

	        // Click login button
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(1600);

	        // Verify homepage (check title or dashboard element)
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);

	        if (pageTitle.contains("OrangeHRM")) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	        }

	        // Close browser
	        driver.quit();
	    }

}
