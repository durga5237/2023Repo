package javatpoint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartproduct {

	public static void main(String[] args)  {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9642193164");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chinna@1290");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.findElement(By.cssSelector("input[class=\"_3704LK\"]")).sendKeys("apple mobiles"+Keys.ENTER);
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //driver.findElement(By.xpath("//button[@type='submit']")).click();
//		WebDriverWait d=new WebDriverWait(driver,5);
//		d.until(ExpectedConditions.visibilityOfElementLocated(null));
	    
		
				
		
		
			}

}
