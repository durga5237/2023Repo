package javatpoint;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		 driver.findElement(By.xpath("/]/h3[text()='Mentorship'")).click();	

//		driver.findElement(By.className("VJZDxU")).sendKeys("9642193164");
//		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("prasad");
//		driver.findElement(By.cssSelector("._3AWRsL")).click();
//		driver.findElement(By.linkText("Forgot?")).click();
//	    Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Chinna1290");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}

}
