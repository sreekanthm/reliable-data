import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class NewTest {
 
public static void main(String[] args) {
 
System.setProperty("webdriver.chrome.driver", "/home/ec2-user");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
 
}
