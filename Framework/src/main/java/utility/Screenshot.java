package utility;

import java.io.File;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;

import reusableComponents.WebDriverHelper;
 
public class Screenshot extends WebDriverHelper { 
	//public WebDriver driver;
	public void getss(String result ) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot) driver);
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	//String ss=System.getProperty("D:\\Selenium\\Selenium-Programs\\Framework\\Screenshot")+result+" ScreenShot"+".png";
	//File destFile=new File(ss);
	//FileUtils.copyFile(srcFile,destFile);
	FileUtils.copyFile(srcFile,new File("D:\\Selenium\\selenium-programs\\Framework\\ScreenShot\\" + result+"Screenshot"+System.currentTimeMillis()+".png"));
		//return ss;
	
		
	}

	

}
