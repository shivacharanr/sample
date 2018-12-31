package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		File file =new File("./src/main/resources/config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		

	}

}
