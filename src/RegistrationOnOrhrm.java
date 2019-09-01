import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationOnOrhrm {

    protected static WebDriver driver;

    public static void main (String [] args) {

        System.setProperty("webdriver.chrome.driver","src/BrowserDriver/chromedriver.exe");

        //Open the Browser
        driver = new ChromeDriver();

        //Maximise the Browser window Screen
        driver.manage().window().fullscreen();
        //Set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Open the Website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Type Username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Type Password
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("admin123");
        //Click on Login
        driver.findElement(By.name("Submit")).click();
        //Click on Welcome Admin
        driver.findElement(By.className("panelTrigger")).click();
        //Select Logout
        driver.findElement(By.linkText("Logout")).click();
        //close the browser
        //driver.close();

    }
}
