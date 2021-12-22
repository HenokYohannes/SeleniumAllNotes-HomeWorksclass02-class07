package com.company.syntaxclass03.classWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classWork {
    /*Navigate to http://syntaxprojects.com
    click on start practicing
    click on simple form demo
    enter any text on first test box
    click on show message
    quite browser
     */

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/");

        }
    }