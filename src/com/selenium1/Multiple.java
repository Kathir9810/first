package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe" );
	WebDriver element =new ChromeDriver();
	element.manage().window().maximize();
	element.get("https://letcode.in/dropdowns");
	WebElement multiple = element.findElement(By.id("superheros"));
	Select m=new Select(multiple);
	m.selectByValue("am");
	m.selectByVisibleText("Captain America");
	m.selectByVisibleText("Batman");
    m.deselectByValue("am");
	System.out.println(m.isMultiple());
	
	//getOptions
	List<WebElement> multi = m.getOptions();
	for (WebElement opt : multi) {
		System.out.println(opt.getText());
		
		}
	System.out.println("--------------");
	
	//getalloptions
	
	List<WebElement> select = m.getAllSelectedOptions();
    for (WebElement sel : select) {
    	System.out.println(sel.getText());
		
	}	
	
System.out.println("-*******");

//getFirstselectedOptions
WebElement first = m.getFirstSelectedOption();
for (WebElement Fir : select) {
	System.out.println(Fir.getText());
	
	
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
