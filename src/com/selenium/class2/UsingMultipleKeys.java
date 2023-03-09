package com.selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMultipleKeys {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        WebElement signIn = driver.findElement(By.xpath("//span[@id='gh-ug']"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(signIn).keyUp(Keys.CONTROL).build().perform();

    }
}
