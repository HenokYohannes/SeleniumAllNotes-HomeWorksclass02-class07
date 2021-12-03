package com.company.syntaxclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("hen@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("kabppap");
          driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
          driver.findElement(By.linkText(" Forgot password")).click();
   driver.findElement(By.partialLinkText("Forgotten")).click();


    }

}
