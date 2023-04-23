package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	//TO PRINT THE FULL PAGE TEXT IN CONSOLE
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("sachin tendulkar");
		
		Robot d = new Robot();
		d.keyPress(KeyEvent.VK_ENTER);
		d.keyRelease(KeyEvent.VK_ENTER);
		String text = driver.findElement(By.xpath("//*[@id=\"cnt\"]")).getText();
		System.out.println(text);
		driver.quit();
	}

}
