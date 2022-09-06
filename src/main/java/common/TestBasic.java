package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBasic {

	public WebDriver driver;
	String CONFIG_FILE = System.getProperty("user.dir") + "/src/main/resources/configuration/config.properties";

	public void openBrowser() {
		Configurations config = new Configurations(CONFIG_FILE);
		System.setProperty("webdriver.chrome.driver", config.getConfigValue("driverPath"));
		driver = new ChromeDriver();
		driver.get(config.getConfigValue("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void clickForWait(By locator, int miliSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement e = driver.findElement(locator);
		if (e.isDisplayed()) {
			e.click();
		}
	}
}
