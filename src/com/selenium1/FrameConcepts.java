package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kathi\\\\eclipse-workspace\\\\Selenium2\\\\driver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.name("fname")).sendKeys("Kathirvignesh");
		driver.findElement(By.name("lname")).sendKeys("P");
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.name("email")).sendKeys("kathir@gmail.com");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
	}

}
