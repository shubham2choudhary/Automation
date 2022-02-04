package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class BrokenImage {
    public static void main(String args[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Broken Images")).click();
        List<WebElement> lst = driver.findElements(By.tagName("img"));

//      driver.findElements(By.xpath("//*[@id=\"content\"]/div/"));
        System.out.println(lst.size());

    }
}
