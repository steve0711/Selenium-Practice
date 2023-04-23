package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class MiniProject {
 WebDriver driver;
	@BeforeClass
	private void browserLaunch() {
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
	    driver= new ChromeDriver(ops);
		
		String url = "https://www.saucedemo.com/";
		driver.manage().window().maximize();
		driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	private void before() {
		Date d = new Date();
		System.out.println("Starting time is" + d);

	}
	@AfterMethod
	private void after() {
      Date n = new Date();
      System.out.println("Ending time is " + n);

	}
	@Test(priority=1)
	private void login() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=2)
	private void addToCart() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
	
	@Test(priority=3)
	private void checkOut() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("checkout")).click();
	}
	
	@Test(priority=4)
	private void bookingSection() throws IOException {
		driver.findElement(By.id("first-name")).sendKeys("STEVE");
		driver.findElement(By.id("last-name")).sendKeys("M");
		driver.findElement(By.id("postal-code")).sendKeys("629161");
		driver.findElement(By.id("continue")).click();
		
	}
	@Test(priority=5)
	
   private void finishTheOrder() throws IOException {
	driver.findElement(By.id("finish")).click();
	//TAKE SCREENSHOT TO CHECK WHETHER THE ORDER IS BOOKED OR NOT
	TakesScreenshot c = (TakesScreenshot)driver;
	File screenshotAS = c.getScreenshotAs(OutputType.FILE);
	File path = new File("C:\\Users\\ANSO M\\Desktop\\JAVA selenium\\FILE SCREENSHOT\\bookingsnap.png");
	FileUtils.copyFile(screenshotAS, path);
	}
	
	@AfterClass
	private void closeBrowser()  {
		
	driver.quit();
		

	}
	
}


























