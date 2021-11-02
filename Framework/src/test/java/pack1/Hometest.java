package pack1;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Homepage;
import reusableComponents.WebDriverHelper;
public class Hometest extends WebDriverHelper {
	 public static Logger log=LogManager.getLogger(WebDriverHelper.class.getName());

	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intializeDriver();
		//driver.get("https://www.elocalshops.com/");
		log.info(" driver intialized");
		driver.get(prop.getProperty("URL"));
		log.info("navigation to url");
	}
	@Test
	public void method( ){
		
		Homepage h=new Homepage(driver);
		h.search().sendKeys("shop");
		h.search().sendKeys(Keys.ENTER);
		
	}
	@Test
	public void validateTitle() {
		Assert.assertTrue(false,driver.getTitle());
	}
	@AfterTest
	public void driverclose()
	{
		
		driver.close();
	}
}
