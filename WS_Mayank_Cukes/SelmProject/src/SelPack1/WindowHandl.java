package SelPack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WindowHandl {
	@Test
	public void WinHan() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		System.out.println("Page Title after clicking link");
		System.out.println(driver.getTitle());
		Set<String> wids=driver.getWindowHandles();
		Iterator<String> itr=wids.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		System.out.println("Page Title after switching to child");
		System.out.println(driver.getTitle());
		driver.switchTo().window(child);
		System.out.println("Page Title after switching to Parent");
		System.out.println(driver.getTitle());
	}
}
