package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
public static void main(String[] args) throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
	WebDriver drop =new ChromeDriver();
	drop.manage().window().maximize();
	drop.get("https://www.facebook.com/login/");
	drop.findElement(By.xpath("//a[@rel='nofollow']")).click();
	Thread.sleep(2000);
	WebElement day = drop.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("4");
	WebElement month = drop.findElement(By.id("month"));
	Select g=new Select(month);
	g.selectByIndex(5);
	WebElement year = drop.findElement(By.id("year"));
	Select f=new Select(year);
	f.selectByVisibleText("2012");
	//g.deselectByIndex(3);
	
	WebElement m = drop.findElement(By.xpath("//label[text()='Male']"));
	System.out.println(m.getText());
	WebElement h = drop.findElement(By.xpath("(//input[@type='radio'])[2]"));
	h.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
