package javatpoint;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
//	String prasad = "durga";

	public static void main(String[] args) {

		int d = 100;
		Assert.assertEquals(d, 100);
		System.out.println("durga");
//		int d1=10;
//		int f=11;
//		
		Assert.assertFalse(10 < 11);
		System.out.println("durga");

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(1000);
//		List<WebElement> all = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//		for (WebElement one : all) {
//
//			if (one.getText().equalsIgnoreCase("india")) 
//			{
//				one.click();
//				break;
//				
//
//				}
//

	}
}
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
//		driver.findElement(By.id("email")).sendKeys("durga prasad");
//		driver.findElement(By.name("password")).sendKeys("9642193164");
//		
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.findElement(By.xpath("//a[@class='bodySmall form-footer']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("katakatladurga@gmail.com");
//		driver.findElement(By.cssSelector("input[autocomplete='email']")).clear();
//		driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("laxman");
//
//
//		driver.findElement(By.xpath("//input[@name='commit']")).click();
//		
//		//driver.findElement(By.cssSelector("input[autocomplete='email']")).clear();
