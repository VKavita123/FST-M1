package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity5 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.linkText("My Account")).click();
        String accountTitle = driver.getTitle();
        Assert.assertEquals(accountTitle,"My Account – Alchemy LMS");
        driver.quit();
    }
}
