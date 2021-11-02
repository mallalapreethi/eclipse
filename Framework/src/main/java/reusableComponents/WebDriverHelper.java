package reusableComponents;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.io.FileHandler;

public class WebDriverHelper {
public static WebDriver driver;
public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Selenium-Programs\\Framework\\testdata\\config.properties");
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-Programs\\Framework\\driver\\chromedriver.exe" );
	  driver = new ChromeDriver();
		//execute in chrome browser
	}else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium-Programs\\Framework\\driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 //execute in firefox
	}else if(browsername.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Selenium-Programs\\Framework\\driver\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 //execute in edge
	}
	return driver;
	}/*
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Selenium\\selenium-programs\\Framework\\ScreenShot\\" + result+System.currentTimeMillis() + ".png"));
	}*/

}
