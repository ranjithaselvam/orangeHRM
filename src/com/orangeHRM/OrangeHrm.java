package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[2]/li[2]/a")).click();
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("ranjitha");
		driver.findElement(By.id("Form_submitForm_FirstName")).click();
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("ranjitha");
		driver.findElement(By.id("Form_submitForm_LastName")).click();
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("selvam");
		driver.findElement(By.id("Form_submitForm_Email")).click();
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("ranjitha666@gmail.com");
		driver.findElement(By.id("Form_submitForm_JobTitle")).click();
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("tester");
		driver.findElement(By.id("Form_submitForm_NoOfEmployees")).click();
		{

			WebElement dropdown = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));

			dropdown.findElement(By.xpath("//option[. = '301 - 350']")).click();
			Select s = new Select(dropdown);
		}
		driver.findElement(By.id("Form_submitForm_NoOfEmployees")).click();
		driver.findElement(By.id("Form_submitForm_CompanyName")).click();
		driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("abc technology");
		driver.findElement(By.id("Form_submitForm_Industry")).click();
		{
			WebElement dropdown = driver.findElement(By.id("Form_submitForm_Industry"));
			dropdown.findElement(By.xpath("//option[. = 'Travel']")).click();
			
		}
		driver.findElement(By.id("Form_submitForm_Industry")).click();
		driver.findElement(By.id("Form_submitForm_Contact")).click();
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("987654321");
		driver.findElement(By.id("Form_submitForm_Country")).click();
		{
			WebElement dropdown = driver.findElement(By.id("Form_submitForm_Country"));
			dropdown.findElement(By.xpath("//option[. = 'Sweden']")).click();
		}
		driver.findElement(By.id("Form_submitForm_Country")).click();
		driver.findElement(By.id("Form_submitForm_action_request")).click();
	}
}
