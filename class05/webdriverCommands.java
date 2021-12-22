package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // get the url
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//navigate to this website
        // fill the username
        // delete the username
       // fill the new user bame " Tester"

         WebElement userName=driver.findElement(By.cssSelector("input#ct100_MainContent_username"));
  userName.sendKeys("AON");
   //delete the userame enteredThread.sleep(2000);
        Thread.sleep(2000);
userName.clear();
//enter the new username
        Thread.sleep(2000);
    userName.sendKeys("Tester");
    }
}
