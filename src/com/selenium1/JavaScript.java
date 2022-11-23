package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
		WebDriver script=new ChromeDriver();
		script.manage().window().maximize();
		script.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=16949344131681533861&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061967&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiA68ebBhB-EiwALVC-NgBiQZBTjuKQATza7vgAZvzmMlqOQeyKTnvzqHaWEHe6rqLluBcTrhoCWMYQAvD_BwE");
		WebElement link = script.findElement(By.linkText("Japan"));
		JavascriptExecutor js =(JavascriptExecutor) script;
		js.executeScript("arguments[0].scrollIntoView();", link);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		
		
	}

}
