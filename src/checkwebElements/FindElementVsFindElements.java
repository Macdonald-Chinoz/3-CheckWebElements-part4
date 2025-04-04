package checkwebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Difference between FindElement VS FindElements
 * findElement() method returns the first matching element on the current page
 * if the element is not found then it shows NoSuchElementFoundException
 * findElements() method returns all the matching elements on the current page and it doesn't throw any exception
 * if the element is not found,Instead it will return zero elements.
 */
public class FindElementVsFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:demo.nopcommerce.com/");
		
		/*
		//findElement=Returns the single web element
		//Scenario 1=using findElement and locator is pointing to single element
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("XYZ");//Inputs characters/value into searchbox
		
		//Scenario 2-using findElements but locator is pointing to multiple elements
		//when this happens the 1st elemnt is returned in the footer section
		//understand even if you are using findElement which is pointing to multiple webElements 
		//still findElement will return single web element(the first element
		WebElement rdmElm=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(rdmElm.getText());
		
		//Scenario 3-trying to findElemnt using findElement but the element is not available on webpage
		//let me know google chrome exception
		//so "Search" exists in webpage but lets say I put in login instead of the right name
		WebElement searchbutton=driver.findElement(By.xpath("//button[normalize-space()='login']"));
		*/
		
		//findElements=Returns multiple webElements
		
		//Scenario 1=using findElements to return multiple web elements	
		
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));//captures all links
		 System.out.println("Number of elements captured:"+links.size());//return 22
		 
		 for(WebElement ele:links)
		 {
			 System.out.println(ele.getText());
			 
		 }
		 
		 //perhaps I want to perform a certain action on one/on the multiple web selected
		 //so we will need use a look statement to get each and every element from this link
		 //and then you can perform the action
		 
		 // statement will allow us to integrate all web elements one after another
			 //and then we can perform certain action
			 /*
			  * in this particular loop how it will work is:
			  * with this "links",it will capture the first element into the 'ele' variable
			  * and then capture the text of it has found/selected and it does this multiple times till it has 
			  * captured all the web elements in the variable.
			  * this codes puts our words into action-by printing all the web elements found=in this case the footer section
			  */
				 
		 /*
		 //Scenario 2=using findElements but locator is pointing to single elements
		 //trying to return a single element/element that is matching
		 List<WebElement>logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));//this is logo element of site		 
		 System.out.println(logo.size());
		 */
		/*
		//Scenario 3= getting an exception by inputting an element that doesn't exist
		List<WebElement>elements=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
		System.out.println(elements.size());//it will 0 because there is no matching web element on site
		 */
		

	}

}
