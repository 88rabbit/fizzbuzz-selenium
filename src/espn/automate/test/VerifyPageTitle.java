package espn.automate.test;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import espn.automate.helper.TargetPage;
 
public class VerifyPageTitle {
/**
* @param args
*/
              
// objects and variables instantiation
WebDriver driver;

@Before   
public void createConection()
{
	driver = new FirefoxDriver();
}

@Test
public void verifyPageTitle()
{
	try{
		String expectedTitle = " NFL Scoreboard "; 	
		TargetPage targetPage = new TargetPage(driver);	
		targetPage = targetPage.navigateToNflScoresPage();
		String actualTitle = targetPage.getPageTitle();
		System.out.print("Actual Title is : " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	catch (Exception exp)
	{
		System.out.println(exp);
	}
}

@After
public void closeConnection()
{
	driver.close();
}

}
