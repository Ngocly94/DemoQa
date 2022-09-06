package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TextBoxPage extends Page {

	public TextBoxPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	public void fullName(String userName) {
		WebElement fullNameElement = driver.findElement(By.id("userName"));
		fullNameElement.click();
		fullNameElement.sendKeys(userName);
	}
	
	public void email(String email) {
		WebElement emailElement = driver.findElement(By.id("userEmail"));
		emailElement.click();
		emailElement.sendKeys(email);
	}
	public void currentAddress(String address1) {
		WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
		currentAddressElement.click();
		currentAddressElement.sendKeys(address1);
	}
	public void permanentAddress(String address2) {
		WebElement permanentAddressElement = driver.findElement(By.id("permanentAddress"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,500)");
		Actions actions = new Actions(driver);
		actions.moveToElement(permanentAddressElement);
		actions.click().build().perform();
		permanentAddressElement.sendKeys(address2);
	}
	
	public void clickButtonSubmit() {
		
		WebElement buttonSubmitElement = driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']//*"));
		buttonSubmitElement.click();
		
	}
	public boolean viewFormDisplayed() {
	return	driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).isDisplayed();
	
	}
	
	// Kiểm tra thông tin sau submit
	public String checkFullName() {
		return driver.findElement(By.id("name")).getText().replace("Name:","");
	}
	public String checkEmail() {
		return driver.findElement(By.id("email")).getText().replace("Email:","");
	}
	public String checkCurentAddress() {
		return driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']//p[3]")).getText().replace("Current Address :", "");
	}
	public String checkPermanentAddress() {
		return driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']//p[4]")).getText().replace("Permananet Address :", "");
	}
	public void refresh() {
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.COMMAND).sendKeys(Keys.chord("R")).keyUp(Keys.COMMAND).perform();
	    driver.navigate().to("https://demoqa.com/text-box");
	}
	
	//Fail Email
//	public void failClickSubmit() {
//		WebElement buttonSubmitElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("scroll(0,700)");
//		Actions actions = new Actions(driver);
//		actions.moveToElement(buttonSubmitElement);
//		actions.click().build().perform();
//	
//	}
	
	public boolean viewRedBorderEmailDisplayed() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,-500)");
		return	driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//div[@class='col-md-9 col-sm-12']//input[@class='mr-sm-2 field-error form-control']")).isDisplayed();
}
	

}
