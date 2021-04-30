package sagar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipletest {
    WebDriver driver;
    
    @Test
    public void firstmethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://wanisheth.com");
        System.out.println(driver.getTitle());
        String title= driver.getTitle();
        Assert.assertEquals(title, "Wanisheth - Home");
        driver.quit();
    }
    @Test
    public void secondmethod(){
        System.out.println("in second  test anotation");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://wanisheth.com");
        System.out.println(driver.getTitle());
        String title= driver.getTitle();
        Assert.assertEquals(title, "Wanisheth- Home");
        driver.quit();
    }
    @Test
    public void thirdmethod(){
        System.out.println("in third  test anotation");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://wanisheth.com");
        System.out.println(driver.getTitle());
        String title= driver.getTitle();
        Assert.assertEquals(title, "Wanisheth - Home");
        driver.quit();
    }    
}
