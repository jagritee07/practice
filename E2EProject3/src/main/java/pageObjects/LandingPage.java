package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
	
	By signin=By.cssSelector("#homepage > header > div.tools > div > nav > ul > li:nth-child(4) > a");
	By title=By.cssSelector("#content > div > div > h2");
	By NavBar=By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public WebElement getLogin()
	{
	 
	return  driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	

}
