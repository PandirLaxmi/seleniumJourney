package com.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxAndRadio {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.ebay.co.uk/sch/ebayadvsearch");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='LH_Charity']"));
        checkbox.click();
        WebElement radio = driver.findElement(By.id("s0-1-17-6[7]-[4]-LH_PrefLoc"));
        radio.click();
        WebElement cookie = driver.findElement(By.id("gdpr-banner-accept"));

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(cookie));
        // cookie.click(); not working due to some issue will check in js
        //driver.close();

    }
}
