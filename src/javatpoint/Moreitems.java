package javatpoint;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moreitems {

	public static void main(String[] args) throws InterruptedException {
		int j=10;
		String[] itemsneeded = { "Cucumber", "Tomato" };
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector(".product-action"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName=name[0].trim();
			List need = Arrays.asList(itemsneeded);

			if (need.contains(formatedName))

			{
				j++;
				
				
				driver.findElements(By.cssSelector("//div[@class='product-action']/button")).get(i).click();
                if(j==4)
                {
                	break;
                }
			}
		}
	}
}
