import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UserRegistration {

    protected static WebDriver driver;

    public static void main (String [] args) {

        System.setProperty("webdriver.chrome.driver","src/BrowserDriver/chromedriver.exe");

        //Open the Browser
        driver = new ChromeDriver();
        //Maximise the Browser window screen
        driver.manage().window().fullscreen();
        //Set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register Button
        driver.findElement(By.linkText("Register")).click();
        //Enter First Name
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Mitesh");
        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //Enter Email
        driver.findElement(By.name("Email")).sendKeys("patel.mitesh20@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("abcd123");
        //Enter Confirm Password
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("abcd123");
        //Click on Register
        driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
    }
}
