package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import common.TestBasic;

public class TestCases {
		public TestBasic testBasic = new TestBasic();
		@BeforeClass
		public void openWebsite() {
			testBasic.openBrowser();// Mở trình duyệt
		}
 //   	@AfterClass
		public void closeWebsite() {
			testBasic.closeBrowser();// Đóng trình duyệt
}
	}

