package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties propsProperties;
	
	public ReadConfig() {
		//file is a predefine method inside io.File
		File srcfFile = new File("./Configuration/config.properties");  //./ refers root dir 
		
		try {
			FileInputStream fileInputStream = new FileInputStream(srcfFile);
			propsProperties= new Properties();
			propsProperties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	
	public String readurlfromConfigFile() {
		String readurl = propsProperties.getProperty("baseUrl");
		return readurl;
	}
	
	public String readusernamefromConfigFile() {
		String readusername = propsProperties.getProperty("email");
		return readusername;
	}
	
	public String readpasswordfromConfigFile() {
		String readpassword = propsProperties.getProperty("password");
		return readpassword;
	}
	
	public String readbrowserfromConfigFile() {
		String readbrowser = propsProperties.getProperty("browser");
		return readbrowser;
	}
}
