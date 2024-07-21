package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddToCart {
	
WebDriver driver;
	
	// constructor
	
	public AddToCart(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver) 
		// All the elements in this class are being initialised.
		
		
	}
	@FindBy(xpath = "//*[@id='button-cart']")
      private WebElement Addbutton;
	
	@FindBy(xpath = "//*[text()='shopping cart']")
	private WebElement shoppingbutton;
	
	@FindBy(xpath = "//*[text()='Checkout']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAddbutton() {
		return Addbutton;
	}

	public WebElement getShoppingbutton() {
		return shoppingbutton;
	}
//	Bussiness Method

	public void addcart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
	Addbutton.click();
	js.executeScript("window.scrollBy(0,-900)");
	
	
	shoppingbutton.click();
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,900)");
	
	checkout.click();
	
	
		
	}
}
