package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenshotCapture {
    public static WebDriver driver;
    public static void main(String args[]) throws IOException {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://googles.com");
            driver.manage().window().maximize();
            List<WebElement> lst = driver.findElements(By.name("q"));
            System.out.println("Test Case Passed");
        }
        catch (Throwable t){
            System.out.println("TestCase is failed.");
            TakesScreenshot st = (TakesScreenshot) driver;
            File src = st.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("D:\\googleFailure.png"));
        }

    }
}
