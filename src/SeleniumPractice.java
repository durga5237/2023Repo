import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		obj.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		int count = 0;
		List<WebElement> total = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for (WebElement one : total) {
			count = count + Integer.parseInt(one.getText());
			System.out.println(one.getText());

		}

		System.out.println(count);
	}

}
