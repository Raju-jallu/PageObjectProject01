package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class NewCarsPage extends BasePage {
	
	
	

	public NewCarsPage(WebDriver driver) {
		super(driver);
		
	}
	 @FindBy(xpath="//a[@title='BMW']")
		private WebElement bmw;
	 
	 @FindBy(xpath="//a[@title='Tata']")
		private WebElement tata;
	 
	 @FindBy(xpath="//a[@title='Audi']")
		private WebElement audi;
	 
	public BMWCarsPage gotoBMWCars() {
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	 
	    	bmw.click();
		 
	    	return new BMWCarsPage(driver); 
		  }
	 public TataCarsPage gotoTataCars() {
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	 
	    	tata.click();
	    	return new TataCarsPage(driver);
		  }
	 
	 public AudiCarsPage gotoAudiCars() {
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	 
	    	audi.click();
	    	return new AudiCarsPage(driver);
		  }
	
}


