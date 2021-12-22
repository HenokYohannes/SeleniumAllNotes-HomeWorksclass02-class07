package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class dropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

// find the WebElement "drop dwon"
        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));
// use the select class to select from drop down

        Select select = new Select(days);
//select.selectByIndex(1);
//        Thread.sleep(2000);
//
//   select.selectByIndex(2);
//        Thread.sleep(2000);
//        select.selectByIndex(7);
//        Thread.sleep(2000);

        // select by visible text
        select.deselectByVisibleText("Wednesday");

        // select by value
        //select.selectByValue("Wednesday");


        List<WebElement> allOptions = select.getOptions();
        int Size = allOptions.size();
        System.out.println(Size);
        // iterate though list all options and get the text of each option

        for (int i = 0; i < Size; i++) {


            String OptionText = allOptions.get(i).getText();
            System.out.println(OptionText);

// first get all the options


List<WebElement>options=select.getOptions();

                Iterator<WebElement> it= options.iterator();
            while (it.hasNext()) {
                System.out.println(it.next().getText());
            }

        }
    }
}