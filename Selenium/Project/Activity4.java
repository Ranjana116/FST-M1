import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
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


     // Click PIM
             driver.findElement(By.xpath("//span[text()='PIM']")).click();

             // Click Add button
             driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

             // Enter Employee Details
             String firstName = "Ranjana";
             String lastName = "Arya";

             driver.findElement(By.name("firstName")).sendKeys(firstName);
             driver.findElement(By.name("lastName")).sendKeys(lastName);
             Thread.sleep(1500);
             // Save Employee
             
             driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

             // Wait for save operation
             Thread.sleep(3000);

             // Navigate to Employee List
             driver.findElement(By.xpath("//span[text()='PIM']")).click();
             driver.findElement(By.xpath("//a[text()='Employee List']")).click();

             // Search Employee
            
             WebElement employeeName =
                     driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));

             employeeName.sendKeys(firstName);
             
             driver.findElement(By.xpath("//button[@type='submit']")).click();

             Thread.sleep(3000);

             // Verify Employee Creation
             boolean employeeFound = driver.getPageSource().contains(firstName);

             if (employeeFound) {
                 System.out.println("Employee created successfully.");
             } else {
                 System.out.println("Employee creation verification failed.");
             }

             // Close Browser
             driver.quit();
         }

       
}
