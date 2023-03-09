package com.selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class HandlingMultipleWindows {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        Actions actions = new Actions(driver);
        WebElement register = driver.findElement(By.xpath("//span[@id='gh-ug-flex']/a"));
        actions.keyDown(Keys.CONTROL).click(register).keyDown(Keys.CONTROL).build().perform();

        String originalWindow = driver.getWindowHandle();
        Set<String> listOfWindows = driver.getWindowHandles();

        for (String window :
                listOfWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
            }
        }
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(originalWindow);

    }
}
