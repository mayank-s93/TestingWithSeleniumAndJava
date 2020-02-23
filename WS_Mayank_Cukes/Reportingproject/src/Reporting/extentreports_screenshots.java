package Reporting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreports_screenshots {

	 
		 
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
	 
	@Test(priority=0)
	public void verifyTitle()
	{
	report=new ExtentReports("C:\\Report\\TestAutomation.html");
	 
	logger=report.startTest("VerifyRediffmailTitle");
	 System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
	 driver=new InternetExplorerDriver();
	 
	driver.manage().window().maximize();
	 
	logger.log(LogStatus.INFO, "Browser started ");
	 
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	logger.log(LogStatus.INFO, "Application is up and running");
	 
	String title=driver.getTitle();
	 
	Assert.assertTrue(title.contains("Rediffmail")); 
	 
	logger.log(LogStatus.PASS, "Title verified");
	}
	 
	
	@Test(priority=1)
	public  void  invalidtitle()
	{
		
		String title=driver.getTitle();
		 
		Assert.assertTrue(title.contains("Rediffmail2")); 
		 
		logger.log(LogStatus.FAIL, "Title invalid");
		
	}
	
	 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.SUCCESS)
	{
	 
	
        String  screenshot_path=UtilMethods.screenshotcapture(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title verification", image );
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
	driver.get("C:\\Report\\TestAutomation.html");
	}
	 
	 
	}