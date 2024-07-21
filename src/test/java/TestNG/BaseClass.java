package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod(){
		System.out.println("Before Method");
	}
	@BeforeTest(alwaysRun=true)
	public void TC_001() {
		System.out.println("Test case 2");
	}
	@Test(groups= {"regression"})
	public void TC_002() {
		System.out.println("Test case 3");
	}
	@AfterTest(alwaysRun=true)
	public void TC_004() {
		System.out.println("Test case 4");
	}
}
