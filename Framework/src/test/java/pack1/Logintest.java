package pack1;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Login;
import reusableComponents.WebDriverHelper;

public class Logintest extends WebDriverHelper {
	 public static Logger log=LogManager.getLogger(WebDriverHelper.class.getName());
	/*@BeforeTest
	public void intialize() throws IOException {
		
		//driver.get("https://www.elocalshops.com/");
		
	}*/
	@Test(dataProvider="getdata")
	public void method1(String email, String password) throws IOException{
		driver=intializeDriver();
		log.info(" driver intialized");
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		log.info("navigation to url");
		Homepage h=new Homepage(driver);
		h.login().click();
		Login l=new Login(driver);
		l.EmailId().sendKeys(email);
		l.password().sendKeys(password);
		l.sign_in().click();

}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[1][2];
		data[0][0]="firstmail@gmail.com";
		data[0][1]="pass1";
		//data[1][0]="secondmail@gmail.com";
		//data[1][1]="pass2";
		
		return data;
		

}
	@AfterTest
	public void driverclose()
	{
		driver.close();
	}
}
