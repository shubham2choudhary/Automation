package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        List<WebElement> lst = driver.findElements(By.linkText("Checkboxes"));
        lst.get(0).click();
        List<WebElement> lst1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
        lst1.get(0).click();
        System.out.println("Lst Size: "+ lst.size()+",Lst 1 Size: "+ lst1.size());
    }
}
