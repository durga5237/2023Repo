package javatpoint;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkartproductbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		//driver.findElement(By.id("email")).sendKeys("katakatladurgaprasad@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Chinna5237");
		//driver.findElement(By.linkText("Forgot Password")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("katakatladurgaprasad@gmail.com");
		//driver.findElement(By.xpath("//input[@name='commit']")).click();		
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		  //driver.findElement(By.id("btnclosepaxoption")).click();
		    driver.get("http://3.110.88.201/dropdownsPractise/"); 
		    WebElement prasad= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		    Select  durga=new Select(prasad);
		    durga.selectByIndex(3);
		    System.out.println( durga.getFirstSelectedOption().getText());
		    durga.selectByValue("AED");
		    System.out.println(durga.getFirstSelectedOption().getText());
		    durga.selectByVisibleText("INR");
		    System.out.println(durga.getFirstSelectedOption().getText());
		    driver.findElement(By.cssSelector("#divpaxinfo")).click();
		    Thread.sleep(3000);
		    int g=1;
		    while(g<5) {
		    	 driver.findElement(By.id("hrefIncAdt")).click();
		    	 g++;
		    }
		    		
		    int h=1;
		    while(h<=3) {
		    	driver.findElement(By.id("hrefIncInf")).click();
		    	h++;
		    }
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options  = driver.findElements(By.cssSelector("li[class$='ui-menu-item'] a"));
	     String s="listitem";
		for(WebElement listitem :options);
		 // if(listitem.gettext().equals("india"));
		  
		
		//option.
	
		
		
	 
	
			
		
		
}}
