package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {

    public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
                WebDriver driver = new ChromeDriver();

   driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
// navigate to synatax check demo and check the first checkbox

WebElement singleCheckBox =driver.findElement(By.cssSelector("input#isAgeSelected"));
   singleCheckBox.click();

  List <WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));


int size=checkBoxes.size();
        System.out.println(" THe total number of checkboxes is :"+size);

//
for(WebElement checkBox: checkBoxes){
   // checkBox.click();
//get the attribute "value"
// select the check box with the text option 3

// get the attribute "value of the all checkbox
String valueofArttribute=checkBox.getAttribute(" value");

    System.out.println(valueofArttribute);
//check only whose value is option 3

    if(valueofArttribute.equalsIgnoreCase("Option-3"));
    //click on the checkbox whose attribute value is option 3
checkBox.click();


}
    }

}
