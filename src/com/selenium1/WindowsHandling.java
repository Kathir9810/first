package com.selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");	
	
	    Actions ac =new Actions(driver);
	    Robot rb =new Robot();
	    
	    WebElement best = driver.findElement(By.linkText("Best Sellers"));
		ac.contextClick(best).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mobile).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		ac.contextClick(customer).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			
		}
        String myString="Amazon.in Bestsellers: The most popular items on Amazon";
        
        for (String id : windowHandles) {
			if (driver.switchTo().window(id).getTitle().equals(myString)) {
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
