package javatpoint;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectmodel2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		pageobjectClass p = new pageobjectClass(driver);
		p.email().sendKeys("9642193164");
		p.pswd().sendKeys("Chinna5237");
		p.loginbutton().click();

	}

}
