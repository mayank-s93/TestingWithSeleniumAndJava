package SelPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionsEX {
	@Test
	public void DynXp() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//String obj=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).getAttribute("placeholder");
	
		//System.out.println(" placeholder text --> "+obj);
		
		Actions a1=new Actions(driver);
		WebElement obj=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]/span"));
		a1.moveToElement(obj).build().perform();
		
		WebElement obj1=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
		a1.moveToElement(obj1).build().perform();
		
		WebElement obj2=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[5]/span"));
		a1.moveToElement(obj2).click().build().perform();
		/*Actions a1=new Actions(driver);
	
	a1.moveToElement(SignIn).perform();
	driver.findElement(By.partialLinkText("Order")).click();*/
	}
}
