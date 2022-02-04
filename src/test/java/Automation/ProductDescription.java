package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductDescription {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=product/product&product_id=43']")).click();
        String str = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[1]/b")).getText();
        System.out.println(str);
        String str1 =driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[2]")).getText();
        System.out.println(str1);
        String str2 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[3]/b")).getText();
        System.out.println(str2);
        String str3 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[4]")).getText();
        System.out.println(str3);
        String str4 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[5]/b")).getText();
        System.out.println(str4);
        String str5 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[6]")).getText();
        System.out.println(str5);
        String str6 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[7]/b")).getText();
        System.out.println(str6);
        String str7 = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div/p[8]")).getText();
        System.out.println(str7);

    }
}
