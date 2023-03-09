package com.selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIframes {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        //switching to the iframe
        //An iframe is a website inside another website
        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrame);

        WebElement textArea = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        textArea.clear();
        textArea.sendKeys("Hello World!");

        //going out of the iframe
        driver.switchTo().defaultContent();

        WebElement title = driver.findElement(By.xpath("//div[@class='example']/h3"));

        System.out.println(title.getText());


    }
}
