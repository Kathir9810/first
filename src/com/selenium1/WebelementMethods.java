package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;

public class WebelementMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kathi\\\\eclipse-workspace\\\\Selenium2\\\\driver\\\\chromedriver.exe");
	     WebDriver element =new ChromeDriver();
	     element.manage().window().maximize();
	     element.get("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwtp2bBhAGEiwAOZZTuLW_bUuC1FwGzGmG1fxnPT0Pa7ZIuXIsw5m87Ic16b6qq_30Efu6VhoCbqwQAvD_BwE");     
	     WebElement userNumber = element.findElement(By.xpath("//input[@autocomplete='new-password']"));
	     System.out.println(userNumber.isEnabled());
	     System.out.println(userNumber.isDisplayed());
	     System.out.println(userNumber.isSelected());
	     userNumber.sendKeys("8270491329");
	     //WebElement userLogin = element.findElement(By.xpath("//div[@class='submitBottomOption']"));
	     //userLogin.click();
	     WebElement element2 = element.findElement(By.xpath("//div[text()='HOME LIVING']"));
	     System.out.println(element2.getText());
	     
	     
}
	
	
	
	
	
	
	
	
}
