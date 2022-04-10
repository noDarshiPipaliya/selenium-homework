package edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SauceDemoTest {
    public static void main(String[] args) {
        String baseUrl = "https://saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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



        WebElement usernameField = driver.findElement(By.id("user-name"));
        // sending email to email field to element
        usernameField.sendKeys("Devanshi");
        // find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        //sending password to password field element
        passwordField.sendKeys("1234");

        driver.close();


    }
}
