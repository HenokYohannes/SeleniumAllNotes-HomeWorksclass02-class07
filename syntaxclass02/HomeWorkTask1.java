package com.company.syntaxclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTask1 {

    public static void main(String[] args) throws InterruptedException {
        /*HW1
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
*/
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Heiko");
        driver.findElement(By.id("customer.lastName")).sendKeys("Johannes");
        driver.findElement(By.id("customer.address.street")).sendKeys("Battlefield");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ashburn");
        driver.findElement(By.id("customer.address.state")).sendKeys(" VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20146");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("customer.ssn")).sendKeys("N/A");
        driver.findElement(By.id("customer.username")).sendKeys("heiko@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("********");
        driver.findElement(By.id("repeatedPassword")).sendKeys("********");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();

       Thread.sleep(2000);

        driver.close();
    }


}
