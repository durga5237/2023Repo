package javatpoint;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws Exception {

		String downloadPath = System.getProperty("user.dir");

		WebDriverManager.chromedriver().setup();

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\katak\\Documents\\ScriptFi.exe");

		driver.findElement(By.className(".btn.btn--process.btn--red.pdfoffice")).click();

		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(5000);

		File f = new File(downloadPath + "/converted.docx");

		if (f.exists())

		{

			Assert.assertTrue(f.exists());

			if (f.delete())

				System.out.println("file deleted");

		}

	}

}
