package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class AudiCarsPage extends BasePage {

	public AudiCarsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void getTitle () {
		
	   	 
	 	System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Audi Cars']")).getText());
		
	}

}
