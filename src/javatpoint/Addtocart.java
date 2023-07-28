package javatpoint;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://3.110.88.201/dropdownsPractise/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\images"));

//		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
//		
//		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
//		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());

	}

}
