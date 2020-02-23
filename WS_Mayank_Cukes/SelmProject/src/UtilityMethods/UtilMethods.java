package UtilityMethods;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilMethods {

	public static String screenshotcapture(WebDriver driver, String ScreenshotsName){
		try{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("./Screenshots/"+ScreenshotsName+".png"));
			
			System.out.println("ScreenShots taken");
		}
		catch(Exception e){
			System.out.println("Exception there"+e.getMessage());
		}
		return ScreenshotsName;
	}
}
