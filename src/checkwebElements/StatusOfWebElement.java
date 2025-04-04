package checkwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To check web-element this are the methods to do so:(also known to as conditional command)
 * 1-isDisplayed()
 * 2-isEnalbled()
 * 3-isSelected()
 */
public class StatusOfWebElement {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:frontend.nopcommerce.com/");
		
		
		//isDisplayed()=checks if webElemnt is there		//isEnabled=checks if webElemnt takes input
		/*
		 * So Testing a webElement first require us to find the code used to make that element
		 * in this case we looked for the code used to make a web-search box
		 * we have the options of using ID(any other title to refer to the search-box)
		 * so we chose the xPath (from the SelectorsHub) by right-clicking our search-box and clicking Inspect
		 * once there we that copied and used it in the findElement meta for our driver
		 * (this findElement meta will locate the search-box using our script) 
		 * 
		 * we also give the findElement meta a variable to be able to easily refer back to it.
		 * + since the entire statement is written as a Web-Element so the written type should be webElement
		 * so what we have done until now is capture our webElement and store it in the correct type
		 */
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status:"+searchStore.isDisplayed());//since webEle is there we expect True
		System.out.println("Enabled Status:"+searchStore.isEnabled());//should also return true
		
		//isSelected()=checks whether element is selected or not(like check-boxes/radio buttons/dropdowns)
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		
		male.click();//selects male radio button
		System.out.println(male.isSelected());//true
		System.out.println(female.isSelected());//false
		
		female.click();//selects female radio button
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//true
		
		
		
		
		
		
		
		


	}

}
