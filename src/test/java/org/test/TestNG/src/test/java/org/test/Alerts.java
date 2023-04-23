package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		//PROMPT ALERT
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
	   
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	
		Alert key = driver.switchTo().alert();
		key.sendKeys("MICHAEL GLORY");
		key.accept();
		
		
	}

}
