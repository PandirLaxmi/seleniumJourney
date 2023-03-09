package com.selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadOption {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("C:\\Users\\Lenovo\\IdeaProjects\\seleniumJourney\\src\\com\\selenium\\files\\123.txt");

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();


    }
}
