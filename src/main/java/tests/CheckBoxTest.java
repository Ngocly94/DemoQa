package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CheckBoxPage;
import pages.ElementPage;
import pages.HomePage;

public class CheckBoxTest extends TestCases{
	
	public String textCheckAllChecKBoxString = "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
	@Test(priority = 1)
	public void verifyCheckBox() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickElementForm();
		ElementPage elementPage = new ElementPage(testBasic.driver);
		elementPage.clickCheckBoxForm();
		CheckBoxPage checkBoxPage = new CheckBoxPage(testBasic.driver);
		checkBoxPage.clickButtonArrowHome();
		if(checkBoxPage.homeSelected()==false) {
			System.out.println("Chưa được tích");
		}
		    System.out.println("False");
		if(checkBoxPage.desktopDisplayed()&&checkBoxPage.documentDisplayed()&&checkBoxPage.downloadDisplayed()) {
			System.out.println("Đã hiển thị đủ 3 option");
		}
		else {
			System.out.println("False");
		}
		checkBoxPage.clickCheckBoxDesktop();
		checkBoxPage.clickCheckBoxDocument();
		checkBoxPage.clickCheckBoxDownload();
		assertEquals(checkBoxPage.textResult(), textCheckAllChecKBoxString);
	}

}
