package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Minipjt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kathi\\eclipse-workspace\\Selenium2\\driver\\chromedriver.exe");
		WebDriver element=new ChromeDriver();
		element.manage().window().maximize();
		element.get("http://adactinhotelapp.com/index.php");
		WebElement username = element.findElement(By.id("username"));
		username.sendKeys("Kathir98");
		WebElement password = element.findElement(By.id("password"));
		password.sendKeys("RQUF8A");
		element.findElement(By.id("login")).click();
		WebElement locat = element.findElement(By.id("location"));
		Select s=new Select(locat);
		s.selectByValue("Adelaide");
		WebElement hot = element.findElement(By.id("hotels"));
		Select s1=new Select(hot);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = element.findElement(By.id("room_type"));
		Select s2=new Select(room);
		s2.selectByValue("Super Deluxe");
		WebElement roomnumbers = element.findElement(By.id("room_nos"));
		Select s3 =new Select(roomnumbers);
		s3.selectByVisibleText("2 - Two");
		WebElement date = element.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("15/11/2022");
		WebElement date2 = element.findElement(By.id("datepick_out"));
		date2.clear();
		date2.sendKeys("20/11/2022");
		WebElement adult = element.findElement(By.id("adult_room"));
		Select s5=new Select(adult);
		s5.selectByValue("2");
		WebElement child = element.findElement(By.id("child_room"));
	    Select s6=new Select(child);
	    s6.selectByValue("0");
	    element.findElement(By.id("Submit")).click();
	    WebElement radio = element.findElement(By.id("radiobutton_0"));
		radio.click();
		element.findElement(By.id("continue")).click();
		WebElement firname = element.findElement(By.id("first_name"));
		firname.sendKeys("kathir");
		WebElement lasname = element.findElement(By.id("last_name"));
		lasname.sendKeys("vignesh");
		WebElement address = element.findElement(By.id("address"));
		address.sendKeys("3-1-47,pandiannagar,kallupatti.");
		WebElement credit = element.findElement(By.id("cc_num"));
		credit.sendKeys("8270491329223355");
		WebElement type = element.findElement(By.id("cc_type"));
	    Select s7=new Select(type);
	    s7.selectByValue("VISA");
	    WebElement month = element.findElement(By.id("cc_exp_month"));
	    Select s8=new Select(month);
	    s8.selectByVisibleText("December");
	    WebElement year = element.findElement(By.id("cc_exp_year"));
	    Select s9=new Select(year);
	    s9.selectByVisibleText("2022");
	    WebElement cvvno = element.findElement(By.id("cc_cvv"));
	    cvvno.sendKeys("456");
	    element.findElement(By.id("book_now")).click();
	   
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
