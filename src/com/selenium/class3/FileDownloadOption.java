package com.selenium.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.HashMap;

public class FileDownloadOption {
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "C:\\Users\\Lenovo\\IdeaProjects\\seleniumJourney\\src\\com\\selenium\\files\\");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);


        ChromeDriver driver = new ChromeDriver(options);

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();
        WebElement downloadBtn = driver.findElement(By.xpath("//a[text()='README.md']"));
        downloadBtn.click();


    }
}
