package com.selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);
        List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']//img"));
        WebElement trashArea =  driver.findElement(By.id("trash"));
        Actions action = new Actions(driver);
        for (WebElement image :   images) {
            action.dragAndDrop(image , trashArea ).pause(2000).build().perform();
        }
        driver.close();

    }
}
