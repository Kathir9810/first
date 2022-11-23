package com.selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
		WebDriver alert =new ChromeDriver();
		alert.manage().window().maximize();
		alert.get("https://letcode.in/alert");
		//simplealert
		alert.findElement(By.id("accept")).click();
		alert.switchTo().alert().accept();
		
		//confirmalert
		alert.findElement(By.id("confirm")).click();
		alert.switchTo().alert().dismiss();
		
		//promptalert
		alert.findElement(By.id("prompt")).click();
		Alert prompt = alert.switchTo().alert();
		prompt.sendKeys("java");
		prompt.accept();
		
		
		
		
	}

}
