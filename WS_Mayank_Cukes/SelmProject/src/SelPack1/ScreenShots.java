package SelPack1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class ScreenShots {
	@Test
	public void ScShots() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(src new File("C:\\Selenium\\Screenshots"));
		driver.close();
		
	}
	

}
//C:\\Selenium\\Screenshots
