package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPage extends Page {

	public ElementPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
public ElementPage clickTextBoxPage() {
	WebElement texBoxElement = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
	texBoxElement.click();
	return new ElementPage(driver);
}
//Click CheckboxPage
	public ElementPage clickCheckBoxForm(){
		WebElement elementCheckBoxElement = driver.findElement(By.xpath("//span[normalize-space()='Check Box']"));
		elementCheckBoxElement.click();
		return new ElementPage(driver);
}
}
