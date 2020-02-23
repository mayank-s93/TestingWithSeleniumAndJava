package SelPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Action2 {
	/*@Test
	public void DynXp1() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	//Actions a1=new Actions(driver);
	String Obj=driver.findElement(By.xpath(".//*[@id='u_0_h']")).getText();
	System.out.println("Available text is --> "+Obj);
	
	//a1.moveToElement(arrow).click().build().perform(); //.moveToElement(driver.findElement(By.linkText("Amazon Fire TV Stick"))).moveToElement(driver.findElement(By.linkText("Amazon Prime Video"))).click().build().perform();
	
	
	}*/
	@Test (priority=0)
	public void D(){
		System.out.println("D");
	}
	@Test(priority=-3)
	public void E(){
		System.out.println("E");
	}
	@Test(priority=-2)
	public void G(){
		System.out.println("G");
	}
	@Test(priority=0)
	public void C(){
		System.out.println("A");
	}
	
}
