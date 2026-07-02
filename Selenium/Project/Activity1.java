import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) throws InterruptedException {
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://hrm.alchemy.hguy.co/");
	    String element1 =driver.getTitle();
	    System.out.print(element1);
	    Thread.sleep(1600);
	    String s2="OrangeHRM";
	    System.out.println(element1.equals(s2));
	    	
	    driver.close();
	  }
}

