package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.TestNGException;

public class eprovider {

	public Object[][] getData() {

		Object[][] s = new Object[3][2];
		s[0][0] = "firstphonenumber";
		s[0][1] = "firstpswd";

		s[1][0] = "secondphonenumber";
		s[1][1] = "secondpswd";

		s[2][0] = "thirdphonenumber";
		s[2][1] = "thirdpswd";

		return s;

	}

	@Test(dataProvider = "getData")
	public void flipkart(String username, String pswd) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pswd);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}

}
