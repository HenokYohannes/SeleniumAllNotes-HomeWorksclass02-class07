package com.company.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingText {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/");
        //driver.manage().window().maximize();

        WebElement alertLink = driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        Thread.sleep(2000);
        alertLink.click();
    }
}