package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void homepage() {
        WebElement heading=driver.findElement(By.className("entry-title"));
        Assert.assertEquals(heading.getText(), "“Learn from Industry Experts");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
