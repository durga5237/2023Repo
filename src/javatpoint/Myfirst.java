package javatpoint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirst {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.id("email")).sendKeys("54252155");
		driver.findElement(By.name("pass")).sendKeys("Chinna@xxx");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.findElement(By.cssSelector("._9ay7")).getText());
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("chinna");
		driver.findElement(By.id("dfghdh")).sendKeys("dgdhh");

	}
}
