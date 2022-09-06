package tests;

import org.testng.annotations.Test;

import pages.FormPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTest extends TestCases{
	String firstName = "Ngọc";
	String lastName = "Lê";
	String userEmail = "ngocle210894@gmail.com";
	String userNumber = "0838690247";
	String subject = "Không có";
	String dateOfBirth = "12/12/2022";
	String address = "123";
	
	
	@Test
	public void submitDataSuccessfully() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickForm();
		FormPage formPage = new FormPage(testBasic.driver);
		formPage.clickPracticeForm();
		PracticeFormPage practiceFormPage = new PracticeFormPage(testBasic.driver);
		practiceFormPage.firstName(firstName);
		practiceFormPage.lastName(lastName);
		practiceFormPage.email(userEmail);
		practiceFormPage.gender();
		practiceFormPage.numberPhone(userNumber);
		//practiceFormPage.dateOfBirthPicker(dateOfBirth);
		practiceFormPage.subject(subject);
		practiceFormPage.hobbies();
		practiceFormPage.chooseFile();
		practiceFormPage.currentAddress(address);
		practiceFormPage.submitButton();
		
	}
}
