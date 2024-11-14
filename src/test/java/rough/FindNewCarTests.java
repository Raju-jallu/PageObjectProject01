package rough;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import pages.AudiCarsPage;
import pages.BMWCarsPage;
import pages.HomePage;
import pages.NewCarsPage;
import pages.TataCarsPage;

public class FindNewCarTests {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//BasePage bp =new BasePage(driver);
		
	    HomePage home=new HomePage(driver); 
		
		//home.SearchCars();
		//home.gotoPopularCars();
		NewCarsPage car= home.findNewCars();
		
		car.gotoAudiCars();
		//car.gotoBMWCars();
		
        //TataCarsPage tataCars=car.gotoTataCars();
		//tataCars.getTitle();
        
		System.out.println(BasePage.carsBase.getTitle());
		
		//AudiCarsPage audiCars=car.gotoAudiCars();
		//audiCars.getTitle();
		
		// new HomePage(driver).findNewCars().gotoTataCars().getTitle();
		 //new HomePage(driver).findNewCars().gotoBMWCars().getTitle();
		 System.out.print("execution completed");
		

	}

}
