package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement>tables=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("row size"+" "+ tables.size());
		
		List<WebElement>columns=driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("column size"+" "+ columns.size());
		
		String ComapanyName="Island Trading";
		
		WebElement comapany=driver.findElement(By.xpath("//td[text()='"+ComapanyName+"']"));
		WebElement contact=driver.findElement(By.xpath("//td[text()='"+ ComapanyName+"']/following::td[1]"));
		WebElement country=driver.findElement(By.xpath("//td[text()='"+ComapanyName+"']/following::td[2]"));
		
		System.out.println("My company name is"+ " " + comapany.getText());
		System.out.println("My contact name is"+ " " + contact.getText());
		System.out.println("My country name is"+ " " + country.getText());


	}

}
