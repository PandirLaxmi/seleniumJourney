package com.selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropdownExample {
    static ChromeDriver driver; // made static so that it can be called inside the static methods
    public static void main(String[] args) {
        //set the driver property and get driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.ebay.com/sch/ebayadvsearch");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        printAlldropdownOptions("s0-1-17-4[0]-7[3]-_sacat");

        //dropdownOptions.selectByIndex(4);
        //dropdownOptions.selectByValue("550");
        //dropdownOptions.selectByVisibleText("Antiques");

    }

    public static void printAlldropdownOptions(String id) { // made static to be able to call this in static mathods
        WebElement dropdown = driver.findElement(By.id(id));

        Select dropdownOptions = new Select(dropdown);

        List<WebElement> listOfOptions = dropdownOptions.getOptions();

        for (WebElement option : listOfOptions) {
            System.out.println(option.getText());
        }
    }
}
