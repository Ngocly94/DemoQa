package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ElementPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextboxTest extends TestCases {
	public String userName = "Lê Yến Ngọc";
	public String email = "ngocle210894@gmail.com";
	public String address1 = "885 Tam Trinh";
	public String address2 = "885 Tam Trinh";

	@Test(priority = 1)
	public void subMitSuccessfully() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickElementForm();
		ElementPage elementPage = new ElementPage(testBasic.driver);
		elementPage.clickTextBoxPage();
		TextBoxPage textBoxPage = new TextBoxPage(testBasic.driver);
		textBoxPage.fullName(userName);
		textBoxPage.email(email);
		textBoxPage.currentAddress(address1);
		textBoxPage.permanentAddress(address2);
		textBoxPage.clickButtonSubmit();
		if (textBoxPage.viewFormDisplayed()) {
			System.out.println("Đăng ký thành công");
		} else {
			System.out.println("Đăng ký không thành công");
		}
		assertEquals(userName, textBoxPage.checkFullName());
		assertEquals(email, textBoxPage.checkEmail());
		assertEquals(address1, textBoxPage.checkCurentAddress());
		assertEquals(address2, textBoxPage.checkPermanentAddress());
	}

	@Test(priority = 2)
	public void emailFormatIsWrong() throws InterruptedException {
		TextBoxPage textBoxPage = new TextBoxPage(testBasic.driver);
		textBoxPage.refresh();
		Thread.sleep(5000);
		textBoxPage.email("ngocle210894gmail.com");
		textBoxPage.permanentAddress(address2);
		textBoxPage.clickButtonSubmit();
	//	assertFalse(textBoxPage.viewFormDisplayed(),"Dữ liệu không lưu được do email thiếu @");
		assertTrue(textBoxPage.viewRedBorderEmailDisplayed(), "Trường email thiếu @");
	
	}

}