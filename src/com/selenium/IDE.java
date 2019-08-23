package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;


public class IDE {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ranjitha.selvam\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
	    driver.get("https://adactin.com/HotelApp/");
	    driver.manage().window().setSize(new Dimension(1366, 728));
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("login")).click();
	    driver.findElement(By.linkText("New User Register Here")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("re_password")).click();
	    driver.findElement(By.id("re_password")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("full_name")).click();
	    driver.findElement(By.id("full_name")).sendKeys("ranjithaselvam");
	    driver.findElement(By.id("email_add")).click();
	    driver.findElement(By.id("email_add")).sendKeys("rojaranjitha666@gmail.com");
	    driver.findElement(By.id("captcha-form")).click();
	    driver.findElement(By.id("captcha-form")).sendKeys("mudde");
	    driver.findElement(By.id("tnc_box")).click();
	    driver.findElement(By.id("Submit")).click();
	    driver.findElement(By.linkText("Click here to login")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) img")).click();
	  }
	}



