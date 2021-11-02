package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}

	By search=By.cssSelector("input[class='form-field-input live-search-form-field']");
	//By submit=By.cssSelector("input[class='live-search-button mdc-ripple-surface mdc-ripple-upgraded']");
	
	By login=By.xpath("//*[@id=\'site-header-nav\']/nav/ul[2]/li/a");
	public WebElement search() {
		return driver.findElement(search);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
}
