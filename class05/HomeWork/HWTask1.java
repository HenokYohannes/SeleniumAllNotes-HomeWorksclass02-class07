package com.company.class05.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWTask1 {
    public static void main(String[] args) {

    /*HW1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text
 */
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.findElements(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("The size of list containg links is " + links.size()); // The size of list containg links is 401

        for (WebElement link : links) {
            String linkText = link.getText();

            String linkAddress = link.getAttribute("href");
            System.out.println(linkAddress);

            if (!linkText.isEmpty()) {
                System.out.println(linkText);
            }

        }
    }
}