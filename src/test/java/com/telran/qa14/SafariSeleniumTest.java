package com.telran.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SafariSeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new SafariDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test
    public void searchProductTest() {
        driver.findElement(By.name("search_query")).click();
        driver.findElement(By.name("search_query")).sendKeys("summer dresses" + Keys.ENTER);
//        String text = driver.findElement(By.className("lighter")).getText();
//        Assert.assertEquals(text, "\"SUMMER DRESSES\"");
    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}


