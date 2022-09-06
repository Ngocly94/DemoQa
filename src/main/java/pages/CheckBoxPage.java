package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckBoxPage extends Page {

	public CheckBoxPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	public void clickButtonArrowHome() {// Input Giá trị đúng
		WebElement ButtonArrowHome = driver.findElement(By.xpath("//span[@class='rct-text']//button[@title='Toggle']"));
		ButtonArrowHome.click();
	}
	public boolean homeSelected() {
		return driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox'][1]")).isSelected();
	}
	public boolean desktopDisplayed() {
		return driver.findElement(By.xpath("//span[contains(text(),'Desktop')]")).isDisplayed();
	}

	public boolean documentDisplayed() {
		return driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).isDisplayed();
	}
	public boolean downloadDisplayed() {
		return driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).isDisplayed();
	}
	public void clickCheckBoxDesktop() {
		 driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']")).click();
	}
	public void clickCheckBoxDocument() {
		 driver.findElement(By.xpath("//label[@for='tree-node-documents']//span[@class='rct-checkbox']")).click();
	}
	public void clickCheckBoxDownload() {
		 driver.findElement(By.xpath("//label[@for='tree-node-downloads']//span[@class='rct-checkbox']")).click();
	}
	public String textResult() {
		return driver.findElement(By.xpath("//div[@id='result']")).getText().replace("\n", " ");
	}
	
	
}
