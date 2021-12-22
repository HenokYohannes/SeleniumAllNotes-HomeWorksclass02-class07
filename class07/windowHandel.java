package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandel {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

// get the address/handle of the page/window

        String signUpPageHandle = driver.getWindowHandle();

        System.out.println(" THe window handle for sign page is:" + signUpPageHandle);

// click on help

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

        WebElement termBtn = driver.findElement(By.xpath("//a[text()='Term']"));
        WebElement PrivacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));

        helpBtn.click();
        termBtn.click();
        PrivacyBtn.click();
// we have not switched the focus so it is still on the main/home signing page
        Set<String> allWindowHandles = driver.getWindowHandles();
// print the size oa allWindowHandles

        System.out.println("number of windown handles is :" + allWindowHandles.size());

// inorder to print windo handles we need to iterate over the SET

        Iterator<String> it = allWindowHandles.iterator();

        signUpPageHandle = it.next();
        String helpPageHandle = it.next();
        String termPageHandle = it.next();
        String PrivacyPageHandle = it.next();

        System.out.println(" The handle for main page is:" + signUpPageHandle);
        System.out.println(" The handle for help page is:" + helpPageHandle);
        System.out.println(" The handle for term page page is:" + termPageHandle);
        System.out.println(" The handle for Privacy page is:" + PrivacyPageHandle);


        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());
    }
}