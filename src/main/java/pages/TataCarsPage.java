package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class TataCarsPage extends BasePage {


		
		public TataCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		public void getTitle () {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	 
	 	System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Tata Cars']")).getText());
		
	}
	
}
