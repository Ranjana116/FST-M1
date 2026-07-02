import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
public static void main(String[] args) {
	    
	    WebDriver driver = new FirefoxDriver();
	    
	 
	    	driver.get("https://hrm.alchemy.hguy.co/");
	    	WebElement headerImage = driver.findElement(By.cssSelector("img"));
	    	String imageUrl = headerImage.getAttribute("src");
	    	System.out.println("Header image URL: " + imageUrl);

           driver.close();
}
}