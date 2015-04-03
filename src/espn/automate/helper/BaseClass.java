package espn.automate.helper;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	protected WebDriver driver;
	
	public BaseClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public TargetPage launchPage()
	{
		driver.navigate().to("http://espn.go.com/");
		driver.manage().window().maximize();
		return new TargetPage(driver);
	}

}
