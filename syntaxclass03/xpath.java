package com.company.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));

        Thread.sleep(2000);
        createNewAccount.click();
        Thread.sleep(2000);

        ///html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button

        ////input[@id='email']     //input[@type='password']


    }
}
