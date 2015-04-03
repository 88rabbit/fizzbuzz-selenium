package espn.automate.suit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import espn.automate.helper.TargetPage;
 
public class VerifyPageTitle {

              
// objects and variables instantiation
WebDriver driver;

//Setting up driver connection before starting test case execution
@Before   
public void createConection()
{
	driver = new FirefoxDriver();
}

//test case starts here - script will launch browser, navigate to target page and will verify title
@Test
public void verifyPageTitle()
{
	try{
		String expectedTitle = "NFL Football Scores - NFL Scoreboard - ESPN - ESPN"; 	
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

//Below code will take care of closing driver connections
@After
public void closeConnection()
{
	driver.close();
}

}
