package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		WebElement search=driver.findElement(By.xpath("//textarea[@title='Search']"));
		search.sendKeys("type something");
		search.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		search.sendKeys("type something else");
		
		search.sendKeys(Keys.ENTER);
		
	}
}
