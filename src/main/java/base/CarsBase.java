package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsBase {
	
	WebDriver driver;
	
	public CarsBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}

	@FindBy(xpath="//div/h1")
	WebElement carTitle ;
	
	public String getTitle () {
		
		//carTitle.getText();
		return carTitle.getText();
	}
	//System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Tata Cars']")).getText());
}
