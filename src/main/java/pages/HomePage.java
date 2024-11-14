package pages;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {
	
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//div[normalize-space()='NEW CARS']")
	private WebElement newCar;
	
	@FindBy(xpath="//div[normalize-space()='Find New Cars']")
	private WebElement findNewCars;
	
	
	
	public NewCarsPage findNewCars() {
		
	
		//WebElement newCar = driver.findElement(By.xpath("//div[normalize-space()='NEW CARS']"));
		new Actions(driver).moveToElement(newCar).perform();
		
		findNewCars.click();
		//driver.findElement(By.xpath("//div[normalize-space()='Find New Cars']")).click();
		return new NewCarsPage(driver);
		
	}
    public void SearchCars() {
    	 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Jeep Meridian");
	  }
    public void gotoPopularCars() {
    	 
    	driver.findElement(By.xpath("//span[normalize-space()='Popular']")).click();
	  }
    
   
    
  
}
