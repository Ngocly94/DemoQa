package pages;

import org.openqa.selenium.WebDriver;

public class Page {
	public WebDriver driver;

	public Page(WebDriver dr) {// Tạo constructor
		this.driver = dr;
	}
}
