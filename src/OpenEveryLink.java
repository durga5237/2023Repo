
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEveryLink {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());// total Link
		WebElement postLink = driver.findElement(By.id("trending-links"));
		System.out.println(postLink.findElements(By.tagName("a")).size());// postlink

		List<WebElement> allLinks = postLink.findElements(By.tagName("a"));
		for (int i = 1; i < postLink.findElements(By.tagName("a")).size(); i++)

		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(3000);
			postLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
