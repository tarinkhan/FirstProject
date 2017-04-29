package taru;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
		int x = 1;
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("C:\\JAVA\\report\\Test.html");

		ExtentReports extentreport = new ExtentReports();
		extentreport.attachReporter(htmlReport);

		// Test Case 1
		ExtentTest test1 = extentreport.createTest("Test Case -1");
		if (x == 1) {
			test1.log(Status.PASS, "Validation Passed");
			System.out.println("Pass");
		} else {
			test1.log(Status.FAIL, "Validation Failed");
			System.out.println("Failed");
			
			
			}
            extentreport.flush();
            
	}

}   