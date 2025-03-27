package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;  

public class SeleniumOperations {

    // Sleep method to pause the execution for the given number of seconds
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to automate the registration process and take a screenshot
    public static void officeworks_registration_page(String url) {
       
        System.setProperty("webdriver.chrome.driver", "/Users/eunji/Downloads/chromedriver-mac-arm64/chromedriver");

        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(2);

       
        driver.get(url);

        driver.findElement(By.id("firstname")).sendKeys("Eunji");
        driver.findElement(By.id("lastname")).sendKeys("Kim");
        driver.findElement(By.id("phoneNumber")).sendKeys("12345678910");
        driver.findElement(By.id("email")).sendKeys("eunji@gmail.com");

      
        WebElement createAccountButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
        createAccountButton.click();

       
        sleep(2);

        
        String screenshotPath = System.getProperty("user.home") + "/Desktop/screenshot.png";
        takeScreenshot(driver, screenshotPath);

        
        driver.close();
    }

    // Method to take a screenshot
    public static void takeScreenshot(WebDriver driver, String filePath) {
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);

        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        }
    }
}