package SelPack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckBoxTest {
	
	@Test
	public void CheckB() throws AWTException, InterruptedException{
		 System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
			WebDriver driver=new InternetExplorerDriver();
			WebDriverWait wait=new WebDriverWait(driver,30);
			
			driver.get("http://toolsqa.com/automation-practice-form/");
			driver.manage().window().maximize();
			WebElement ob3=driver.findElement(By.linkText("Link Test"));
			Actions oAction=new Actions(driver);
			  oAction.moveToElement(ob3);
			  oAction.contextClick(ob3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			  Set <String> ids = driver.getWindowHandles();
			  Iterator <String> it = ids.iterator();
			  String currentWindow = it.next();
			  String newWindow = it.next();
			  driver.switchTo().window(newWindow);
			  String srt=driver.getTitle();
			  System.out.println(srt);
			  Thread.sleep(2000);
			  driver.switchTo().defaultContent();
			  Thread.sleep(2000);
			                    //	List<WebElement>    nChk=driver.findElements(By.xpath("//*[@type='checkbox']"));
			WebElement ob1= driver.findElement(By.xpath("//*[@name='firstname']"));
			ob1.sendKeys("Mayank");
			WebElement ob2= driver.findElement(By.xpath("//*[@name='lastname']"));
			
			//List<WebElement>  ndropd=driver.findElement(By.tagName("option"));
			//System.out.println(nChk.size());
			/*Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);*/
			ob2.sendKeys("Srivastava");
			WebElement uploadElement = driver.findElement(By.id("photo"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\Users\\mayan\\Desktop\\My Doc New\\Selenium Resume\\Mayank_Resume.docx");
			
			
			driver.quit();
			
			
			//driver.quit();
		/*	for(WebElement obj: nChk){
				System.out.println(obj.getAttribute("value"));
				if(obj.getAttribute("value").equalsIgnoreCase("Manual Tester"))
				{
					System.out.println(obj.getAttribute("value"));
					obj.click();
					
				}
	} */
	}
}
