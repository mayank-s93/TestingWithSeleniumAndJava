package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DynaXp {
	@Test
	public void DynXp() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.rediff.com/");
	/*	System.out.println("Temp 1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='srchword']")).sendKeys("Wallet");
		System.out.println("Temp 2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@id,'suggest_4')]")).click();
		System.out.println("Temp 3");
		driver.findElement(By.xpath("//*[@id='queryTop']/input")).click();
		System.out.println("Temp 4");*/
		WebElement searchboc=driver.findElement(By.xpath(".//*[@id='srchword']"));
		searchboc.sendKeys("shoes");
		Thread.sleep(5000);
		List<WebElement>    nDrop=driver.findElements(By.xpath(".//*[contains(@id,'suggest')]"));
		System.out.println(nDrop.size());
		for(WebElement obj: nDrop){
			if(obj.getText().contains("sports")){
				System.out.println(obj.getText());
				obj.click();
				break;
			}
		}
		
	}
}
