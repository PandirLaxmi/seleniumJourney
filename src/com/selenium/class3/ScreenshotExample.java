package com.selenium.class3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotExample {
    public static void main(String[] args) throws IOException {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        TakesScreenshot ts = driver;
        File f = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(f, new File("src//com//selenium//files//scrnshot.png"));

    }
}
