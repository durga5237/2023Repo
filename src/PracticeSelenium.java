import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Actions action = new Actions(driver);
		WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));
		WebElement TshirtTab = driver
				.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		action.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();

	}

}
