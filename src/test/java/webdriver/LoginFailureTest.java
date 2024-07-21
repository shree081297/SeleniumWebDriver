package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginFailureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement loginlink = driver.findElement(By.className("login"));
		loginlink.click();
		
		WebElement username=driver.findElement(By.name("user_login"));
		username.sendKeys("abc@mail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Shree@12345");
		
		WebElement rememberMe=driver.findElement(By.id("remember-me"));
		rememberMe.click();
		
		WebElement loginBtn=driver.findElement(By.name("btn_login"));
		loginBtn.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement error=driver.findElement(By.id("msg_box"));
		System.out.println(error.getText());
		
		driver.close();
	}

}
