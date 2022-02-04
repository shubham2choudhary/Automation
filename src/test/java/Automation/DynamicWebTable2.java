package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\WbTable.html");
        List<WebElement> lst = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        List<WebElement> lst2 = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[2]"));
//        System.out.println(lst2.size());
        for (int i = 3; i <= lst.size(); i++) {
            for (int j = 1; j < lst2.size(); j++) {
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td["+j+"]")).getText());
            }
        }
    }
}
