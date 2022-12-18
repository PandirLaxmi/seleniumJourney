package com.selenium.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        // create object of chrome driver
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.in/");
        // Introduce wait for 3 seconds
        Thread.sleep(3000);
        chromeDriver.manage().window().maximize();
        Thread.sleep(3000);
        chromeDriver.close();
    }
}
