package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.linkText("Contact")).click();
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Kavita Vadageri");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Kavita.Vadageri@ibm.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Selenium Project Testing");
        Thread.sleep(3000);
        driver.findElement(By.id("wpforms-submit-8")).click();
        String msg = driver.findElement(By.id("wpforms-confirmation-8")).getText();
        driver.quit();
    }
}
