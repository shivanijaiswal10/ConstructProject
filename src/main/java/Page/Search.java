package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Search {
WebDriver driver;
	
	// constructor
	
	public Search(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver) 
		// All the elements in this class are being initialised.
		
		
	}
	
	// Defining my Page objects
	@FindBy(xpath = " //input[@name='search']")
	private WebElement searchTextbox;
	
	@FindBy(xpath = " //button[@class='btn btn-default btn-lg']")
	private WebElement searchicon;
	
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement product;

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}


	public WebElement getSearchicon() {
		return searchicon;
	}


	public WebElement getProduct() {
		return product;
	}
	
	//Business method
	
	public void searchProduct(String search) throws InterruptedException {
		
		searchTextbox.sendKeys(search);
		
		searchicon.click();
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,900)");
		 
		product.click();
		
	
	  
	}
	
	


}
