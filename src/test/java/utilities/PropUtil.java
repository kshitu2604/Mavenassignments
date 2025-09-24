package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public static Properties readData(String filename)  {
		
		Properties prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+filename);
		

			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prop;
	}

}
