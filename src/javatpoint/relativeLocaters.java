package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocaters {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement prasad=driver.findElement(By.xpath("//label[text()='Password']"));
		driver.findElement(with(By.tagName("input")).above(prasad)).sendKeys("durga prasad");
		WebElement prasad1=driver.findElement(By.xpath("//label[text()='Name']"));
		driver.findElement(with(By.tagName("input")).above(prasad1)).sendKeys("durga");
		
		
	}

}
