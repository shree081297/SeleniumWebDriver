package TestNG;

import org.testng.annotations.Test;

public class OneTcExample extends BaseClass{
	
	@Test(groups={"regression"})
	public void Test_01() {
		System.out.println("First Test");
	}
}
