import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5 {
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


        // Click My Info
            driver.findElement(By.xpath("//span[text()='My Info']")).click();
            Thread.sleep(3000);
        // Click Edit button

//driver.findElement(By.xpath("(//button[contains(@class,'oxd-button') and text()=' Edit '])[1]"))
                 // .click();

for(WebElement e : driver.findElements(By.tagName("input"))) {
    System.out.println("Name Attribute = " + e.getAttribute("name"));
}

//First Name

WebElement firstName = driver.findElement(By.name("firstName"));
firstName.clear();
firstName.sendKeys("Ishika");


         Thread.sleep(1600);
         // Gender
         driver.findElement(By.xpath("//label[text()='Female']/following::span[1]")).click();
         Thread.sleep(1600);
         // Nationality Dropdown
         WebElement nationalityDropdown =
                 driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]"));

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

nationalityDropdown.click();

WebElement indian = wait.until(
    ExpectedConditions.elementToBeClickable(
        By.xpath("//div[@role='option']//span[contains(text(),'Indian')]")
    )
);

indian.click();

         Thread.sleep(1600);
         // DOB
         WebElement dob =
                 driver.findElement(By.xpath("//label[text()='Date of Birth']/following::input[1]"));
         dob.clear();
         dob.sendKeys("1992-11-11");
         Thread.sleep(1600);
         // Save
         driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

   driver.close();          
}
}
