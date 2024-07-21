package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      WebDriver driver = new ChromeDriver();
		      //implicit wait
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		      //URL launch
		      driver.get("https://www.linkedin.com/");
		      // identify element
		      WebElement l = driver.findElement(By.id("session_key"));
		      l.sendKeys("abc");
		      WebElement t = driver.findElement(By.className("sign-in-form__submit-button"));
		      t.click();
		      //expected error text
		      String exp = "Please enter a valid email address or mobile number.";
		      //identify actual error message
		      WebElement m = driver.findElement(By.className("alert-content"));
		      String act = m.getText();
		      System.out.println("Error message is: "+ act);
		      //verify error message with Assertion
		      Assert.assertEquals(exp, act);
		      driver.quit();
		   
		}
	}


