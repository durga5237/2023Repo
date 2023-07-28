package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Httpscer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions object=new ChromeOptions();
		object.setAcceptInsecureCerts(false);
		WebDriver driver=new ChromeDriver();
		//driver.get("https://expired.badssl.com/");
		//ABOVE
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement polo=driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println( driver.findElement(with(By.tagName("label")).above(polo)).getText());
		//BELOW
		WebElement usPolo=driver.findElement(By.xpath("//label[@for='exampleInputPassword1']"));	
		System.out.println(driver.findElement(with(By.tagName("input")).below(usPolo)).getText());	
		WebElement logo=driver.findElement(By.id("inlineRadio2"));
		//TO  LEFT OF
		System.out.println(driver.findElement(with(By.tagName("label")).toLeftOf(logo)).getText());
		//TO RIGHT OF
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(logo)).getText());
		//GET HIGHT
		System.out.println(logo.getRect().getDimension().getHeight());
		//GET WIDTH
		System.out.println(logo.getRect().getDimension().getWidth());
		


	}

}
