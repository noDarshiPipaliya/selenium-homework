package firefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HerokuappTest {
    public static void main(String[] args) {
        String baseUrl = "https://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //launch the URL
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window of launch browser

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get current url
        System.out.println("current url :" + driver.getCurrentUrl());



        WebElement usernameField = driver.findElement(By.id("username"));
        // sending email to email field to element
        usernameField.sendKeys("Devanshi");
        // find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        //sending password to password field element
        passwordField.sendKeys("1234");

        driver.close();


    }
}
