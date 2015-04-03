package espn.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class VerifyPageTitle {
/**
* @param args
*/
       public static void main(String[] args) {
              
// objects and variables instantiation
              WebDriver driver = new FirefoxDriver();
              String appUrl = "http://espn.go.com/";
              
// launch the firefox browser and open the application url
              driver.get(appUrl);
              
// maximize the browser window
              driver.manage().window().maximize();
              
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle = " NFL Scoreboard ";       
 
// click on NFL link
              WebElement NFLLink = driver.findElement(By.xpath("/html/body/div[5]/div[2]/header/nav[1]/ul/li[1]/a/span[2]"));
              NFLLink.click();
              
// click on Score link
              WebElement scoreLink = driver.findElement(By.xpath("/html/body/div[5]/div[2]/header/nav[1]/ul/li[1]/div/ul[1]/li[3]/a/span[1]"));
              scoreLink.click();
              
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              
// compare the expected title of the page with the actual title of the page and print the result
              if (expectedTitle.equals(actualTitle))
              {
                     System.out.println("Verification Successful - The correct title is displayed on the web page.");
              }
             else
              {
                     System.out.println("Verification Failed - An incorrect title is displayed on the web page. Title displayed is : " + actualTitle);
              }
              
// close the web browser
              driver.close();
              System.out.println("Test script executed successfully.");
              
// terminate the program
              System.exit(0);
       }
}