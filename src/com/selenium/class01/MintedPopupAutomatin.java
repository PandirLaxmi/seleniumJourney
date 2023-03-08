package com.selenium.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MintedPopupAutomatin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.minted.com/");
        driver.manage().window().maximize();
        WebElement emailBox = driver.findElement(By.xpath("//div[@class='bx-inputwrap']/input[@type='email']"));
        emailBox.sendKeys("helloWorld@java.com");

    }
}
