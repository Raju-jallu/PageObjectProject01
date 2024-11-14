package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

//import org.openqa.selenium.By;

public class BMWCarsPage extends BasePage {
	
	public BMWCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void getTitle () {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   	 
 	System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='BMW Cars']")).getText());
	
}
}
