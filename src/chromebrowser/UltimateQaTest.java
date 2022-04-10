package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UltimateQaTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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



        WebElement usernameField = driver.findElement(By.id("user[email]"));
        // sending email to email field to element
        usernameField.sendKeys("Devanshi");
        // find password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //sending password to password field element
        passwordField.sendKeys("1234");

        driver.close();


    }
}
