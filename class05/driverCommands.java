package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://ebay.com");

// get all the links that are there on ebay.com
// as we have multiple elements with tag name a so we use driver.findElements...not element
        driver.findElements(By.tagName("a"));

        List<WebElement> links = driver.findElements(By.tagName("a"));


// print  the size of list
        System.out.println("The size os list containing links is :" + links.size());

// print all the links

        for (WebElement link : links) {
            // get the tst out of the webElement link
            String linkText = link.getText();
// only print the links that have some text and ignore the rest

            if (!linkText.isEmpty()) {
                System.out.println(linkText);

           // print all the links also along with the text
           // use the method.getAtrribute to have the value of particular attribute in the tag

           String linkAddress=link.getAttribute("href");
// print the attribute "href" value
                System.out.println(linkAddress);

                System.out.println("---------------------------------------------");

            }

        }

    }
}