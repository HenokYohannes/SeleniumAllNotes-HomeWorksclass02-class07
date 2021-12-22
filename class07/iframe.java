package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

//switch to the desired frame as our desire webelement is inside that frame

        driver.switchTo().frame("frame1");

        // get the webElement
        WebElement text1= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :"+ text1.getText());
// switch to frame2
// as frame 2 doesn not inside frame 1 so
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

   //locate the WebElement
      WebElement text2= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :"+ text2.getText());

        driver.switchTo().defaultContent();


// Switch the focus back to the default i can simply locate
    }
}