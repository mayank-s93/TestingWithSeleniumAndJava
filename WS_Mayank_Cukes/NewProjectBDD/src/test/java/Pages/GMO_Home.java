package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GMO_Home {

	WebDriver driver;
	@FindBy( how=How.NAME, using="bSubmit")
	private WebElement buttonEnterGMO;
	@FindBy( how=How.NAME, using="bAbout")
	private WebElement buttonAboutTheGMO;
	@FindBy( how=How.NAME, using="bBrowserTest")
	private WebElement buttonBrowsTest;
	
	
	public GMO_Home(WebDriver driver){
		this.driver = driver;
	}
	public void enterGMO(){
		buttonEnterGMO.click();		
	}
	public void aboutGMO(){
		buttonAboutTheGMO.click();		
	}
	public void browsTest(){
		buttonBrowsTest.click();		
	}
}
