import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MacbookPro {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        //Open the Browser
        driver = new ChromeDriver();
        //Maximise the Browser Window Screen
        driver.manage().window().fullscreen();
        //Set implicity set for Driver Object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Open the Websitte
        driver.get("https://demo.nopcommerce.com/");
        //Click on Macbook Pro 13 inch
        driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']")).click();
        //Click on Email a Friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //Type Friend's Email
        driver.findElement(By.name("FriendEmail")).sendKeys("bhavya.panchmatiya@gmail.com");
        //Type your Email
        driver.findElement(By.id("YourEmailAddress")).sendKeys("patel.mitesh20@gmail.com");
        //Type Personal Message
        driver.findElement(By.xpath("//textarea[@class='your-email']")).sendKeys("Gift for you Bro... :)");
        //Click on Send Email
        driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();

    }
}
