package com.ecommerce.in;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Regristation {
	WebDriver driver;
@Test(enabled=false)
public void userRegister() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
   driver = new ChromeDriver(options); 
   driver.manage().window().maximize();
   driver.get("https://www.etsy.com/");
  // Thread.sleep(3000);
   WebElement button=driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
  button.click();
//  WebElement regbutton=driver.findElement(By.xpath("//*[@class='wt-grid__item-xs-12']/div[1]/div/button"));
//  regbutton.click();
  Thread.sleep(3000);
  WebElement regbutton=driver.findElement(By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[1]/div/button"));
  regbutton.click();
 Thread.sleep(3000);
 // driver.findElement(By.xpath("//*[@class='wt-grid__item-xs-12']/div/input[@type='email']")).sendKeys("akshay@yopmail.com");
  driver.findElement(By.xpath("//*/input[@type='email']")).sendKeys("akshay232@yopmail.com");
  driver.findElement(By.xpath("//*[@class='wt-grid__item-xs-12']/div/input[@type='text']")).sendKeys("akshay");
  driver.findElement(By.xpath("//*[@class='wt-grid__item-xs-12']/div/input[@type='password']")).sendKeys("akshay@123@123");
  driver.findElement(By.xpath("//div[@class='wt-validation']/button")).click();
  driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
 
    
}
@Test
public void login() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
   driver = new ChromeDriver(options); 
   driver.manage().window().maximize();
	driver.get("https://www.etsy.com/?");
	 WebElement button=driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
	  button.click();
	  Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='wt-grid__item-xs-12']/div/input[@type='email']")).sendKeys("akshay@yopmail.com");
	 // Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='wt-grid__item-xs-12']/div/input[@type='password']")).sendKeys("akshay@123@123");
	// Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='wt-validation']/button")).click();
	//Thread.sleep(3000);
	Thread.sleep(60000);
//	 driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
//	 
//	driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[3]/div/button/span[2]")).click();
//	driver.findElement(By.xpath("//ul/li[3]/div/div/ul/li[11]")).click();
	

	
}
@Test 
public void searchProduct() throws InterruptedException {
	 driver.findElement(By.id("global-enhancements-search-query")).sendKeys("life on wall");
	
	   WebElement searchButton=driver.findElement(By.xpath("//button[@aria-label='Search']"));
	   searchButton.click();
}
@Test
public void addToCart() throws InterruptedException{
	 Thread.sleep(3000);
	//driver.findElement(By.xpath("//div/ol/li/div/div/a[@target='etsy.965245133']")).click();
	driver.findElement(By.xpath("//div/a[contains(@id,'listing-title')]")).click();
	//driver.findElement(By.linkText("Tempered Glass Wall Art-Stained Wall Art -Life of Tree Wall Decor-Glass Printing -Large Wall Art-Wall Hangings-Stained Window Decor")).click();
	  Set<String>handles= driver.getWindowHandles();
	   Iterator it=handles.iterator();
	   String parentid=(String)it.next();
	   String childid=(String)it.next();
	   driver.switchTo().window(childid);
	  
	   WebElement ddown= driver.findElement(By.id("variation-selector-0"));
	   Select select=new Select(ddown);
	   select.selectByIndex(1);
	   Thread.sleep(3000);
	   driver.findElement(By.id("listing-page-personalization-textarea")).sendKeys("aksh");
	   driver.findElement(By.xpath("//div[@class='wt-width-full']/button")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='wt-pb-xs-2']/button")).click();
	   Thread.sleep(3000);
	}
}

