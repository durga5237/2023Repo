import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class invoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\katak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
											
		
		WebDriver driver=new ChromeDriver();
//		System.out.println("durga\t,");
//		System.out.println("Hi Chandra\t, welcome to java");
//		char  ch  = 'A';
//		int   i =  ch;
//		System.out.println(i);
//		
//		int   j =  66;
//		char  c  = (char) j;		
//		System.out.println(c);
		driver.get("https://www.myntra.com/");
		 String actualTitle=driver.getTitle();
		 String ExpectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		 Assert.assertEquals(actualTitle, ExpectedTitle);

		 
	}
	

}
