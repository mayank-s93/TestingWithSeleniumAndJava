package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebTable_Ex {

	@Test
	public void DynXp1() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		WebElement tabl=driver.findElement(By.className("tsc_table_s13"));
		List<WebElement>    noRow=driver.findElements(By.tagName("tr"));
		System.out.println(noRow.size());
		int i=0;
		for(WebElement obj:noRow){
			List<WebElement>    noCols=obj.findElements(By.tagName("td"));
			System.out.println("Columns in "+i+" row "+noCols.size());
			for(WebElement obj2:noCols){
				System.out.println(obj2.getText());
			}
			i++;
			//System.out.println(obj.getText());
		}
	}
	
}
