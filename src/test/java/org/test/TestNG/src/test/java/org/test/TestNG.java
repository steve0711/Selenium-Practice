package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
//	TestNG 
 
public class TestNG {
	
	WebDriver driver;
@BeforeClass
	private void beforeClass() {
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(ops);
	  driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize();

	}
@AfterClass
  private void afterClass() {
	
driver.quit();
  } 
@BeforeMethod

private void before() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod  
private void after() {
	Date d = new Date();
	System.out.println(d);

} 
@Test
private void test1() { 
	driver.findElement(By.name("username")).sendKeys("vindhusa");
	driver.findElement(By.name("password")).sendKeys("vindhushadev");
	driver.findElement(By.name("login")).click();
}
}