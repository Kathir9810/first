package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("8270491329");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("291098");
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
	}

}
