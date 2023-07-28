package javatpoint;

	//imports
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Flipd {

	public static WebDriver driver;
	    
	        public static void main(String[]args) {
	              //close the poppup for login and continue with selections.
	System.setProperty("webdriver.chrome.driver","C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	                  driver=new ChromeDriver();
	                 driver.manage().window().maximize();
	                 driver.get("https://www.flipkart.com/");
	                 driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	        
	            if(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).isDisplayed())
	            {
	                driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
	            }
	            
	        }
	        
	        public static void goToPhones() {//get to the page for mobile phones
	            
	            WebElement Electronics=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
	            
	            Actions hover=new Actions(driver);
	            hover.moveToElement(Electronics).build().perform();
	            
	            WebDriverWait wait=new WebDriverWait(driver,10);
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Mobiles')]")));
	        driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            
	        if(driver.findElement(By.xpath("//h1[contains(text(),'5G')]")).isDisplayed())
	        {
	// a pop up page appears a few times, in order to ignore that and run the code again
	            driver.navigate().back();
	            goToPhones();
	            }
	        
	        }
	        
	        public static void phoneFilters()  {// set price range filters and sort by new and store top 5 results in excel
	            WebDriverWait wait=new WebDriverWait(driver,10);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//div[@id='container']//div//div//div[3]//select[1]")));
	            driver.findElement(By.xpath("//body//div[@id='container']//div//div//div[3]//select[1]")).click();
	            Select s=new Select(driver.findElement(By.xpath("//body//div[@id='container']//div//div//div[3]//select[1]")));

	        }}
