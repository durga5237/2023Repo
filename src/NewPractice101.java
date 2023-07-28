import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewPractice101 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9642193164");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chinna5237");
//		driver.findElement(By.id("durga"));
		Assert.assertTrue(10 < 12);
		System.out.println("durga prasad");
		String d = "durga prasad";
		Assert.assertEquals(d, "durga prasad");
		System.out.println("laxman");

	}

}
