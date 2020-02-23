package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import UtilityMethods.UtilMethods;

public class Dropdowns {
@Test
public void dropTest(){
	 System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//UtilMethods.screenshotcapture(driver, "Browser_Launched");
		driver.manage().window().maximize();
		List<WebElement>    ndropd=driver.findElements(By.tagName("option"));
		//List<WebElement>  ndropd=driver.findElement(By.tagName("option"));
		System.out.println(ndropd.size());
		ndropd.get(3).click();
		for(WebElement obj: ndropd){
			if(obj.getText().equalsIgnoreCase("Africa")){
				System.out.println(obj.getText());
				obj.click();
				break;
			}
}
}
}