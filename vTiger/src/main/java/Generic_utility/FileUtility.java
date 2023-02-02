package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	
	
	

	public String getKeyAndValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("src/test/resources/vtiger.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
		
	}
}
