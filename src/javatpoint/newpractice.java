package javatpoint;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("VJZDxU")).sendKeys("9642193164");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("prasad");
		driver.findElement(By.cssSelector("._3AWRsL")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	

	}

}
