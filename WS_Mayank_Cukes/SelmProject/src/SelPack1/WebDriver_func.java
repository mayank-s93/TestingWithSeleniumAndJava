package SelPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class WebDriver_func 
{
	
	@Test
	public void functions() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Selenium/geckodriver-v0.18.0-win32/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//driver.close();
	driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("abc@redfmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sada");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//*[@value='Go']")).click();
	driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Fprgot")).click();
		/*System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver-v0.18.0-win32/geckodriver.exe");
		System.out.println("Debug 1");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		System.out.println("Debug 2");
		capabilities.setCapability("marionette", true);
		System.out.println("Debug 3");
		WebDriver driver = new FirefoxDriver(capabilities);
		System.out.println("Debug 4");
		driver.get("http://www.google.com");
		driver.manage().window().maximize();  
		driver.quit();*/
	}
	

}
