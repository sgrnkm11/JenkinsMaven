package sagar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VisitWani {
    WebDriver driver;
    @BeforeTest
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testWani() throws InterruptedException {
        driver.get("http://wanisheth.com");
        System.out.println(driver.getTitle());
        String title= driver.getTitle();
        Assert.assertEquals(title, "Wanisheth - Home");
        Thread.sleep(5000);
    }
   @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
