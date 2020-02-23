package SelPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void CheckB() throws InterruptedException{
		 System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
			WebDriver driver=new InternetExplorerDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
			driver.findElement(By.name("proceed")).click();
			driver.wait();
			//Thread.sleep(3000);
		//	Alert al=driver.switchTo().alert();
			org.openqa.selenium.Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
//			Alert al=driver.switchTo().alert();
//			System.out.println(al.getText());
//			al.accept();
		//	driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("abc@redfmail.com");
}
}