package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("abc@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Shree@123");
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.close();
	}

}
