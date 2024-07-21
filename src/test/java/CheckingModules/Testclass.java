package CheckingModules;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Page.AddToCart;
import Page.Search;

import generics.BaseTest;


public class Testclass extends BaseTest { // this is my child class.
	
	// This is where i am writing my test
	
	Search sr;
	
	Properties pr;
	
	AddToCart ac;
	
	
	@Test(priority = 1)
	public void firstTest () throws InterruptedException, IOException {
		
		pr = new Properties();
		
		sr = new Search(driver);
		
		Thread.sleep(4000);
		
		
		sr.searchProduct(srh);
		
		Thread.sleep(4000);
		
		sr.getSearchicon().click();
		
		Thread.sleep(4000);
		
        
		
		sr.getProduct().click();
		
		Thread.sleep(4000);
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		
		pr = new Properties();
		
		ac = new AddToCart(driver);
		Thread.sleep(4000);
		
		ac.getAddbutton().click();
		
		Thread.sleep(4000);
		
		ac.getShoppingbutton().click();
		Thread.sleep(4000);
		 ac.getCheckout().click();
		
		
		
	}
 
	

}
