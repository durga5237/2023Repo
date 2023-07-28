import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://3.110.88.201/dropdownsPractise/"); 

//		TakesScreenshot s = ((TakesScreenshot) driver);
//		File srcFile = s.getScreenshotAs(OutputType.FILE);
//		File desFile = new File("D:\\images\\today.png");
//		FileUtils.copyFile(srcFile, desFile);
//		
		TakesScreenshot ts=((TakesScreenshot)driver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile=new File("D:\\images\\loginscreenshot.png");
		FileUtils.copyFile(srcFile,desFile);


		
		

		

	}

}
