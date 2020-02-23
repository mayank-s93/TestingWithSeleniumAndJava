package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class GMO_Steps {
	static WebDriver driver;
	static WebElement we;
	@Before("@GMOHome")
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\GChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("^I am on GMO Home Page$")
	public void i_am_on_GMO_Home_Page() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@When("I Enter GMO site")
	public void i_Enter_GMO_site() {
		System.out.println("Navigated to "+driver.getTitle());
		driver.findElement(By.name("bSubmit")).click();
	}

	@Then("I should see Catalog page displayed")
	public void i_should_see_Catalog_page_displayed() {
		String catlogTitle=driver.getTitle();
		System.out.println(catlogTitle);
		Assert.assertEquals("OnLine Catalog", catlogTitle);

	}

	@Given("I am on Catalog page")
	public void i_am_on_Catalog_page() {
		System.out.println( " Catalog Page Displayed ");
	}

	@When("I order {string} for item {string}")
	public void i_order_for_item(String ItemNumber, String ItemName) {
		String[] item = ItemName.split(" ");
		String beforeXpath="//strong[contains(text(),'";
		String afterXpath= "')]/ancestor::td/following-sibling::td[2]/child::*/child::*";
		driver.findElement(By.xpath(beforeXpath+item[item.length-1]+afterXpath)).clear();
		driver.findElement(By.xpath(beforeXpath+item[item.length-1]+afterXpath)).sendKeys(ItemNumber);

	}

	@Then("I should see quantity for {string} equals {string}")
	public void i_should_see_quantity_for_equals(String ItemName, String ItemNumber ) {
		String beforeXpath="//strong[contains(text(),'";
		String afterXpath= "')]/ancestor::td/following-sibling::td[2]/child::*/child::*";
		String Inum=driver.findElement(By.xpath(beforeXpath+ItemName+afterXpath)).getAttribute("value");
		Assert.assertEquals(ItemNumber, Inum);
	}

	@Given("I have selected the items")
	public void i_have_selected_the_items() {
		driver.findElement(By.name("bSubmit")).click();
		throw new cucumber.api.PendingException();
	}

	@When("I place the order")
	public void i_place_the_order() {
		System.out.println("The order is placed");
		throw new cucumber.api.PendingException();
	}

	@Then("I should see place order page displayed")
	public void i_should_see_place_order_page_displayed() {

		throw new cucumber.api.PendingException();
	}

	@Given("I am on Place Order page")
	public void i_am_on_Place_Order_page() {

		throw new cucumber.api.PendingException();
	}

	@Given("I confirm my orders and proceed to billing")
	public void i_confirm_my_orders_and_proceed_to_billing() {

		throw new cucumber.api.PendingException();
	}

	@Then("I should see billing page")
	public void i_should_see_billing_page() {

		throw new cucumber.api.PendingException();
	}

	@Given("I am on Billing page")
	public void i_am_on_Billing_page() {

		throw new cucumber.api.PendingException();
	}

	@When("I input customer billing details")
	public void i_input_customer_billing_details() {

		throw new cucumber.api.PendingException();
	}

	@When("I placed the order")
	public void i_placed_the_order() {

		throw new cucumber.api.PendingException();
	}

	@Then("I reciept page should display")
	public void i_reciept_page_should_display() {

		throw new cucumber.api.PendingException();
	}

	@Given("I am in Receipt page")
	public void i_am_in_Receipt_page() {

		throw new cucumber.api.PendingException();
	}

	@When("I opt to return to home page")
	public void i_opt_to_return_to_home_page() {

		throw new cucumber.api.PendingException();
	}

	@Then("I should navigate to GMO home page")
	public void i_should_navigate_to_GMO_home_page() {


	}
	@When("I place order")
	public void i_place_order() {
		driver.findElement(By.name("bSubmit")).click();
	}

	@Then("Order should get placed")
	public void order_should_get_placed() {
		System.out.println("The order is placed");
	}

	@When("I order  for items")
	public void i_order_for_items(DataTable dataTable) {

		List<List<String>> qtyItems= dataTable.asLists(String.class);
		System.out.println("qtyItems = "+qtyItems.size()+"\n"+"qtyItem1 = "+qtyItems.get(0).size());
		for(int i=0;i<qtyItems.size();i++) {
			String[] item_name=qtyItems.get(i).get(0).split("");
			WebElement we =driver.findElement(By.xpath("//input[contains(@name,'"+item_name[item_name.length-1].toUpperCase()+"')]"));
			we.clear();
			we.sendKeys(qtyItems.get(i).get(1));

		}

	}
}
