package sit707_week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class SeleniumOperations {
    
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void open_chrome_and_close() {
        System.setProperty("webdriver.chrome.driver", "/Users/eunji/Downloads/chromedriver-mac-arm64/chromedriver");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(5);
        
        driver.close();
    }

    public static void open_chrome_maximize_close() {
        System.setProperty("webdriver.chrome.driver", "/Users/eunji/Downloads/chromedriver-mac-arm64/chromedriver");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(5);
        
        driver.manage().window().maximize();
        
        sleep(5);
        
        driver.close();    
    }

    public static void load_web_page_close() {
        System.setProperty("webdriver.chrome.driver", "/Users/eunji/Downloads/chromedriver-mac-arm64/chromedriver");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(5);
        
        driver.get("https://selenium.dev");
        
        sleep(5);
        
        driver.close();    
    }

    public static void open_chrome_loadpage_resize_close() {
        // Fill your personal information.
        System.out.println("Hello this is Eunji(224246231) from SIT707");
        
        System.setProperty("webdriver.chrome.driver", "/Users/eunji/Downloads/chromedriver-mac-arm64/chromedriver");
        
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Driver info: " + driver);
        
        sleep(2);
        
        // Load Google page
        driver.get("https://www.google.com");
        
        // Set window size to 640x480 and wait 2 seconds
        driver.manage().window().setSize(new Dimension(640, 480));
        sleep(2);
        
        // Double window size to 1280x960 and wait 2 seconds
        driver.manage().window().setSize(new Dimension(1280, 960));
        sleep(2);
        
        driver.close();    
    }
}