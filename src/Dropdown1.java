import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown1 {
@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9642193164");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chinna5237");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[name()='path'][@class='_1zrN4q'])[2]")).click();
//		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC'] /a"));
//		
//		for (WebElement one : all) {
//			if(one.getText().equalsIgnoreCase("Gaming"));
//			{
//				one.click();
//				break;
				
				 WebElement Electronics=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		            
		            Actions hover=new Actions(driver);
		            hover.moveToElement(Electronics).build().perform();
		            
		            WebDriverWait wait=new WebDriverWait(driver,10);
		            
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Mobiles')]")));
		        driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
			}
}


