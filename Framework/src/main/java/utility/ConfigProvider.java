package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import exceptions.FileInputException;

public class ConfigProvider {
	static Properties props=new Properties();
	public ConfigProvider() throws IOException
	{
		File configFilePath=new File("./testdata/config.properties");
		FileInputStream configFile;
		try {
			configFile=new FileInputStream(configFilePath);
			props.load(configFile);
		}catch(FileNotFoundException e) {
			FileInputException.fileNotFoundException(e);
		}catch(IOException e)
		{
			//e.printStackTrace();
			FileInputException.exception(e);
		}
	}

}
