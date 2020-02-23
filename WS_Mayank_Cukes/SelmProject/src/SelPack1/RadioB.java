package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class RadioB {
	@Test
	public void RadioButton(){
		 System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-form/");
		
			driver.manage().window().maximize();
			List<WebElement>    nRad=driver.findElements(By.xpath("//*[@type='radio']"));
			//List<WebElement>  ndropd=driver.findElement(By.tagName("option"));
			System.out.println(nRad.size());
			
			for(WebElement obj: nRad){
				System.out.println(obj.getAttribute("value"));
				if(obj.getAttribute("value").equalsIgnoreCase("Male"))
				{
					System.out.println(obj.getAttribute("value"));
					obj.click();
					
				}
	}
	}
}
