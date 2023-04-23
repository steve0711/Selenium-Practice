package org.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WindowsHandling {
	public static void main(String[] args) {
		
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 14 pro max",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (512 GB) - Space Black']")).click();
		
     	String parId = driver.getWindowHandle();
     	//to get the parent wondow id
		System.out.println(parId);
		Set<String> allWind = driver.getWindowHandles();
		//To print the all window id
		System.out.println(allWind);
		
		for (String eachId : allWind) {
			if (!eachId.equals(parId)) {
				driver.switchTo().window(eachId);
				
			}
			
		}
				driver.findElement(By.id("add-to-cart-button")).click();
	}
}
