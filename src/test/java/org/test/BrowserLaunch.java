package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

 
public class BrowserLaunch {

	WebDriver driver;
@BeforeClass
	private void beforeClass() {
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(ops);
	  driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
	driver.findElement(By.name("username")).sendKeys("stevemm07");
	driver.findElement(By.name("password")).sendKeys("steve@123qwe");
	driver.findElement(By.name("login")).click();
}

@Test
private void test2() throws AWTException {
	driver.findElement(By.name("location")).click();
	Robot acc = new Robot();
	for (int i = 0; i <5; i++) {
		acc.keyPress(KeyEvent.VK_DOWN);
		acc.keyRelease(KeyEvent.VK_DOWN);	
	}
	    acc.keyPress(KeyEvent.VK_ENTER);
	    acc.keyRelease(KeyEvent.VK_ENTER);

}
@Test
private void test3() throws AWTException {
	driver.findElement(By.name("hotels")).click();
	Robot a = new Robot();
	for (int i = 0; i <2; i++) {
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);	
	}
	    a.keyPress(KeyEvent.VK_ENTER);
	    a.keyRelease(KeyEvent.VK_ENTER);

}
@Test
private void test4() throws AWTException {
	driver.findElement(By.name("room_type")).click();
	Robot ac = new Robot();
	for (int i = 0; i <1; i++) {
		ac.keyPress(KeyEvent.VK_DOWN);
		ac.keyRelease(KeyEvent.VK_DOWN);	
	}
	    ac.keyPress(KeyEvent.VK_ENTER);
	    ac.keyRelease(KeyEvent.VK_ENTER);

}
@Test
private void test5() throws AWTException {
	driver.findElement(By.name("room_nos")).click();
	Robot ax = new Robot();
	for (int i = 0; i <2; i++) {
		ax.keyPress(KeyEvent.VK_DOWN);
		ax.keyRelease(KeyEvent.VK_DOWN);	
	}
	    ax.keyPress(KeyEvent.VK_ENTER);
	    ax.keyRelease(KeyEvent.VK_ENTER);
	    
}
@Test
private void testCheckIn() throws AWTException {
	WebElement date = driver.findElement(By.name("datepick_in"));
	date.clear();
	date.sendKeys("28/03/2023");
	WebElement dat = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	dat.clear();
	dat.sendKeys("29/03/2023");
	driver.findElement(By.name("adult_room")).click();
	Robot s = new Robot();
	for (int i = 0; i <1; i++) {
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);	
	}
	    s.keyPress(KeyEvent.VK_ENTER);
	    s.keyRelease(KeyEvent.VK_ENTER);	    
		
	}
	    

@Test(priority=1) 
private void room() throws AWTException {
	driver.findElement(By.name("child_room")).click();
	Robot x = new Robot();
	for (int i = 0; i <3; i++) {
		x.keyPress(KeyEvent.VK_DOWN);
		x.keyRelease(KeyEvent.VK_DOWN);	
	}
	    x.keyPress(KeyEvent.VK_ENTER);
	    x.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
	    driver.findElement(By.name("first_name")).sendKeys("Steve");
		driver.findElement(By.name("last_name")).sendKeys("Mike");
		driver.findElement(By.name("address")).sendKeys("Mr Steve 98 Shirley Street PIMPAMA QLD 4209 AUSTRALIA");
	    driver.findElement(By.name("cc_num")).sendKeys("1414151842964521");
	    driver.findElement(By.name("cc_type")).click();
	    
	     Robot c = new Robot();
	     for (int i = 0; i <2; i++) {
			c.keyPress(KeyEvent.VK_DOWN);
			c.keyRelease(KeyEvent.VK_DOWN);
		}
	        c.keyPress(KeyEvent.VK_ENTER);
	        c.keyRelease(KeyEvent.VK_ENTER);
	     
	     driver.findElement(By.name("cc_exp_month")).click();
	     Robot e = new Robot();
	     
	     for (int i = 0; i <4; i++) {
			e.keyPress(KeyEvent.VK_DOWN);
			e.keyRelease(KeyEvent.VK_DOWN);
		}
	        e.keyPress(KeyEvent.VK_ENTER);
	        e.keyRelease(KeyEvent.VK_ENTER);
	        
	        driver.findElement(By.name("cc_exp_year")).click();
	        Robot d = new Robot();
	        for (int i = 0; i <5; i++) {
	   		   d.keyPress(KeyEvent.VK_DOWN);
	   		   d.keyRelease(KeyEvent.VK_DOWN);
	   	}
	           d.keyPress(KeyEvent.VK_ENTER);
	           d.keyRelease(KeyEvent.VK_ENTER);
	           
	        driver.findElement(By.name("cc_cvv")).sendKeys("456");
	        driver.findElement(By.name("book_now")).click();
	        driver.findElement(By.name("my_itinerary")).click();
	        WebElement orderId = driver.findElement(By.name("order_id_852056"));
	        String id = orderId.getAttribute("value");
	        System.out.println("ORDER ID IS:" + id);
	        
	}
	
}
	


