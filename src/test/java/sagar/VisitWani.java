package sagar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VisitWani {
    @Test
    public void testWani() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://wanisheth.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
