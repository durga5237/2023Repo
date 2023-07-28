package javatpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectClass {

	WebDriver driver;

	public pageobjectClass(WebDriver driver) {

		this.driver = driver;

	}

	By username = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By password = By.xpath("//input[@type='password']");
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement login;
	
	
	

	public WebElement email() {
		return driver.findElement(username);

	}

	public WebElement pswd() {
		return driver.findElement(password);

	}
	public WebElement loginbutton () {
		return login;
	}
	

}
