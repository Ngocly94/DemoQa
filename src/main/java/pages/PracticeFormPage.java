package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage extends Page{

	public PracticeFormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	public void firstName(String firstName) {
		WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
		firstNameTextBox.click();
		firstNameTextBox.sendKeys(firstName);
	}
	public void lastName(String lastName) {
		WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
		lastNameTextBox.click();
		lastNameTextBox.sendKeys(lastName);
	}
	public void email(String userEmail) {
		WebElement lastNameTextBox = driver.findElement(By.id("userEmail"));
		lastNameTextBox.click();
		lastNameTextBox.sendKeys(userEmail);
	}
	public void numberPhone(String userNumber) {
		WebElement lastNameTextBox = driver.findElement(By.id("userNumber"));
		lastNameTextBox.click();
		lastNameTextBox.sendKeys(userNumber);
	}
	public void gender() {
		WebElement genderButton = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]"));
		genderButton.click();
	}
	public void dateOfBirthPicker(String dateOfBirth) {
		WebElement datePicker = driver.findElement(By.id("dateOfBirthInput"));
		datePicker.clear();
		datePicker.sendKeys(dateOfBirth);
	}
	public void subject(String subject) {
		WebElement subjectTextBox = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subjectTextBox.sendKeys(subject);
	}
	public void hobbies() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,500)");
		WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
		hobbiesCheckbox.click();
	}
	public void chooseFile() {
		
		WebElement clickChooseFileButton = driver.findElement(By.id("uploadPicture"));
		Actions actions = new Actions(driver);
		actions.moveToElement(clickChooseFileButton);
		clickChooseFileButton.sendKeys("/Users/ngocc/Downloads/ZNS 7_THMM_26082022.xlsx");
	}
	public void currentAddress(String address) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,1500)");
		
		WebElement currentAddressTextbox = driver.findElement(By.id("currentAddress"));
		currentAddressTextbox.sendKeys(address);
	}
	public void submitButton() {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.body.style.zoom='67%';");
//		Dimension n = new Dimension(800, 800);  
//		driver.manage().window().setSize(n);
		WebElement clickSubmitButton = driver.findElement(By.xpath("//div[@class='mt-4 justify-content-end row']//button[@id='submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(clickSubmitButton);
		actions.click().build().perform();
//		WebElement myElement = new WebDriverWait(driver,  Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(clickSubmitButton));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
//		
	}

}
