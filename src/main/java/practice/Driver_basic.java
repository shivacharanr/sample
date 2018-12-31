package practice;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_basic {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver;
Thread.sleep(5000);
driver = new ChromeDriver();

driver.get("https://www.google.co.in");
//driver.findElement(By.id("001").
driver.navigate().to("https://www.gmail.com");
driver.navigate().back();

driver.close();
	}

}
