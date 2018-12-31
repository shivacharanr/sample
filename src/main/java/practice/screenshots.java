package practice;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snapshots/snap1.jpg");
		FileUtils.copyFile(src, desc);
		driver.close();
		System.exit(0);

	}

}
