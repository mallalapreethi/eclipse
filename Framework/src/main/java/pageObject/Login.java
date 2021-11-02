
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.id("customer_email");
	 By password =By.xpath("//*[@id=\'customer_password\']");
	 By signin =By.xpath("//*[@id='customer_login']");
	public WebElement EmailId() {
		return driver.findElement(email);	
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement sign_in() {
		return driver.findElement(signin);
	}
}
