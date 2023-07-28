import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		List<WebElement> values = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement value : values) {
			String Url = value.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(Url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int Responce = conn.getResponseCode();
			System.out.println(Responce);
		}

	}

}
