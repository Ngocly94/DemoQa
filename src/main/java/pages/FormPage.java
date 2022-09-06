package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage extends Page {

	public FormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	public FormPage clickPracticeForm(){
		WebElement practiceFormElement = driver.findElement(By.xpath("//div[@class='element-list collapse show']"));
		practiceFormElement.click();
		return new FormPage(driver);
	}
}
