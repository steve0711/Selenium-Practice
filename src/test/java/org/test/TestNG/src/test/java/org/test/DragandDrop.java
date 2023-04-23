package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("(//a[text()=' BANK '])"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement sourc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions acc =new Actions(driver);
		acc.dragAndDrop(src, dest).perform();
		acc.dragAndDrop(sourc, destination).build().perform();
		
		
	}
}
