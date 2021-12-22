package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class radioBtns {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");

WebElement femaleRadioBtn=driver.findElement(By.xpath("/input[@value='Female'][@name='optradio']"));

//check is the radio Btn is displayed
boolean isDisplayed=femaleRadioBtn.isDisplayed();
        System.out.println("The radio Btn is dispalyed on hte webPage  :"+isDisplayed);

  // check is the radio Btn is enabled
boolean  isEnabled= femaleRadioBtn.isEnabled();
        System.out.println(" The radio Btn is Enabled on the webPage :"+isEnabled);

   //check is the femal radio btn is Selected

   boolean isSelected=femaleRadioBtn.isSelected();

        System.out.println(" The female radio Btn is selected on the webPage  :"+ isSelected);

        //unselect the female radio Btn
   // select the female radio btn only if its Enable

   if(isEnabled){
       femaleRadioBtn.click();
   }
  // after clicking the Btn print if it's selected or not

       isSelected=femaleRadioBtn.isSelected();
        System.out.println(" The female radio Btn is selected on the webPage  :"+ isSelected);
   }
}