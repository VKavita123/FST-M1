package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void homepage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "“Alchemy LMS – An LMS Application");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
