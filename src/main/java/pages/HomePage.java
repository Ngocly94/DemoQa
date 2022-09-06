package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{

	public HomePage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	public HomePage clickElementForm(){
		WebElement elementFormElement = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
		elementFormElement.click();
		return new HomePage(driver);
	}
	public HomePage clickForm(){
		WebElement formElement = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
		formElement.click();
		return new HomePage(driver);
	}
}


