package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;

public class Activity4 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        List<WebElement> headerLst = driver.findElements(By.cssSelector(".entry-title"));
        for(WebElement header : headerLst)
        {
            if(header.getText().equals("Email Marketing Strategies"))
            {
                Assert.assertEquals(header.getText(),"Email Marketing Strategies");
                driver.quit();
            }
        }
    }
}
