package co.wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

    public static void main(String[] args) {

        // Set ChromeDriver options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the browser window

        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dev\\Downloads\\chromedriver.exe");

        // Initialize the WebDriver with ChromeDriver and options
        WebDriver driver = new ChromeDriver(options);

        // Set up waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // For explicit waits

        // Set up implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait with a timeout of 10 seconds

        // Step 1: Open the Yahoo login page
        System.out.println("Step 1: Opening Yahoo login page");
        driver.get("https://login.yahoo.com");

        // Step 2: Enter the username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='login-username']"));
        System.out.println("Step 2: Entering username");
        usernameInput.sendKeys("edureka@yahoo.com");

        // Step 3: Click the 'Next' button
        WebElement nextButton = driver.findElement(By.xpath("//input[@id='login-signin']"));
        System.out.println("Step 3: Clicking 'Next' button");
        nextButton.click();

        // Step 4: Close the browser
        System.out.println("Step 5: Closing the browser");
        driver.quit();
    }
}

