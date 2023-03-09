package com.selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassExample {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        //hover on the web element and then click
        WebElement electronics = driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li/a[text()='Electronics']"));
        WebElement apple = driver.findElement(By.xpath("//a[@class='hl-cat-nav__js-link' and text()='Apple']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).pause(3000).click(apple).build().perform();
    }
}
