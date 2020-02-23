package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SpAction {

	@Test
	public void DynXp1() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		List<WebElement>    noFr=driver.findElements(By.tagName("frame"));
		System.out.println(noFr.size());
		driver.switchTo().frame("login_page");
		driver.findElement(By.className("input_password")).sendKeys("12313");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.partialLinkText("Privacy")).click();
	}
}
