package SelPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Links {
 @Test
 public void noLink(){
	 System.setProperty("webdriver.ie.driver","C:/Selenium/IEDriverServer_Win32_3.5.1/IEDriverServer.exe" );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.ebay.in/");
		driver.manage().window().maximize();
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter'"));
		List<WebElement>  nLinks=(List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(nLinks.size());
		
		for(WebElement obj: nLinks){
			/*if(obj.getText().equalsIgnoreCase("Sell")){
				System.out.println(obj.getText());
				obj.click();
				break;
			}*/
			System.out.println(obj.getText());
		}
 }
}
