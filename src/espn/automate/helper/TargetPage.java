package espn.automate.helper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TargetPage extends BaseClass{

	public TargetPage(WebDriver driver) {
		super(driver);
	}

	public TargetPage navigateToNflScoresPage()
	{
		
		TargetPage targetPage =  new TargetPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5); 
		targetPage.launchPage();

		// wait until page get loaded	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[2]/header/nav[1]/ul/li[1]/a/span[2]")));
		
		// get NFL URL web element		
        WebElement NFLLink = driver.findElement(By.xpath("/html/body/div[5]/div[2]/header/nav[1]/ul/li[1]/a/span[2]"));
        
        // click on NFL link
        NFLLink.click();
        
        //click on Score link
        WebElement scoreLink = driver.findElement(By.xpath("/html/body/div[5]/div[2]/header/nav[1]/ul/li[1]/div/ul[1]/li[3]/a/span[1]"));
        scoreLink.click();
		
        return new TargetPage(driver);
		
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
}
