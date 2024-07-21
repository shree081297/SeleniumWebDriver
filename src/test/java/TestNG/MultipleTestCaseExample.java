package TestNG;

import org.testng.annotations.*;

public class MultipleTestCaseExample extends BaseClass{
	
	
	@Test(priority=2)
	public void TC_001() {
		System.out.println("Test case 2");
	}
	@Test(enabled=true , priority=1)
	public void TC_002() {
		System.out.println("Test case 3");
	}
	@Test(priority=0, groups= {"regression","smoke"})
	public void TC_004() {
		System.out.println("Test case 4");
	}
}
