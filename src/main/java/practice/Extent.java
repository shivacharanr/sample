package practice;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports report = new ExtentReports("./reports/report.html", true);
		File file = new File("./src/main/resources/extent-config.xml");
		report.loadConfig(file);
		
		ExtentTest test = report.startTest("TC01", "login");
		test.assignAuthor("shiva");
		test.assignCategory("smoke");
		
		test.log(LogStatus.PASS, "successfully logged in");
		test.log(LogStatus.PASS, "successfully logged out");
		
		report.endTest(test);
		report.flush();
		
		
		
		

	}

}
