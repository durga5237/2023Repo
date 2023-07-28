package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import java.lang.String;

public class Staticdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/#");
		WebElement staticDpdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDpdown);
		dropdown.selectByIndex(1);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("USD");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		driver.findElement(By.id("divpaxinfo")).click();
		dropdown.isMultiple();
		
		
		int []durga= {2,5,6,7,8,91,5,201,525};
		for(int i=0;i<durga.length;i++) 
			if(durga[i]%2==1)
		{
			System.out.println(durga[i]);
		}
		
//		String [] p= {"durga katakatla selenium"};
//		for(int i=0;i<p.length;i++) {
//			
//		System.out.println(p.);
	
		}
		
		
//		

		

	}
}
