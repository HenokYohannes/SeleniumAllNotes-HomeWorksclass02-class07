package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HomeWork {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        //driver.manage().window().maximize();

        WebElement Ins = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        Ins.click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        WebElement Fac = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech']']"));

        Fac.click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("number of window handles is :" + windowHandles.size());

        Iterator<String> it = windowHandles.iterator();

        String Insta = it.next();
        String Face = it.next();

        System.out.println("The handle for Instagram is :" + Insta);
        System.out.println("The handle for Facebook is :" + Face);
        driver.switchTo().window(Face);

//driver.quit();
    }
}