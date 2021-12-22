package com.company.syntaxclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.syntaxprojects.com");
        // driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='list-group-item' and text()='Simple Form Demo']")).click();

   driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("batch11");
        Thread.sleep(2000);
driver.findElement(By.xpath("//buttom[text()=\"show Message\"]")).click();


    }


}
