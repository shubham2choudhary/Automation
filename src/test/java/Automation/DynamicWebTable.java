package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\WbTable.html");
        List<WebElement> lst = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        for (int i = 3; i <= lst.size(); i++) {
            System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[1]")).getText());
        }
    }
}
