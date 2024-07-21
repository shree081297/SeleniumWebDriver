package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		WebElement tabBtn=driver.findElement(By.id("tabButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabBtn);

		tabBtn.click();
		
		List<String>allWindows=new ArrayList<>(driver.getWindowHandles());
		System.out.println(allWindows.get(0));
		System.out.println(allWindows.get(1));
		
		driver.switchTo().window(allWindows.get(1));
		WebElement header=driver.findElement(By.id("sampleHeading"));
		System.out.println(header.getText());
		driver.close();
		
		driver.switchTo().window(allWindows.get(0));
		
		driver.quit();

	}

}
