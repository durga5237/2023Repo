package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {
    @Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		WebElement Statiopdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Statiopdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		int p = 1;
		while (p <= 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			p++;

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
