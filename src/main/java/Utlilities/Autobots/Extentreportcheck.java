package Utlilities.Autobots;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportcheck {
	public static ExtentReports extent;
	ExtentTest test;
	public static ExtentReports getreports() {
		String path=System.getProperty("user.dir")+"//reports//report.html";
		
		ExtentSparkReporter report= new ExtentSparkReporter(path);
		report.config().setReportName("Greenkart Autobots");
		report.config().setDocumentTitle("Greenkarttest Results");
		extent = new ExtentReports();
		extent.attachReporter(report);
		return extent;
		
	}

}
