package com.selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorExample {
    static ChromeDriver driver;
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        //to execute custom javascript we need this object


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        highlight(searchBox);
        searchBox.sendKeys("iPhone 14");
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        highlight(searchBtn);
    }

    public static void highlight(WebElement element){
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].style.border = '4px solid red'", element);

    }
}
