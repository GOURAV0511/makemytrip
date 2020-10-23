package com.ustglobal.sampleproject.makemytrip;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class Registeration {
	
	public WebDriver driver;
	
  
/**
 * @throws Exception
 */
@Test
  public void f() throws Exception {
	Thread.sleep(6000);
	
	  driver.findElement(By.xpath("//li[contains(@class,'makeFlex hrtlCenter font10 makeRelative lhUser')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[contains(@class,'makeFlex googleLoginBtn flexOne')]")).click();
	  Set<String> s = driver.getWindowHandles(); 
	  System.out.println(s);
      ArrayList<String>al=new ArrayList<String>(s); 
      System.out.println(al.get(0));
	  System.out.println(al.get(1)); 
	  driver.switchTo().window(al.get(1));
	  driver.findElement(By.id("identifierId")).sendKeys("gkjsr1@gmail.com");
	  driver.findElement(By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]")).click();
	  driver.findElement(By.name("password")).sendKeys("8051236767");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]")).click();
	  driver.switchTo().window(al.get(0));
	  Thread.sleep(8000);
	  driver.findElement(By.id("resetEmailPass")).sendKeys("8779933053");
	  driver.findElement(By.xpath("//button[contains(@class,'capText font16')]")).click();
	  Thread.sleep(9000);
	  driver.findElement(By.xpath("//button[contains(@class,'capText font16')]")).click();
	  driver.findElement(By.xpath("//span[text()='Hotels']")).click();
	 // Thread.sleep(3000);
	  //driver.findElement(By.xpath("//span[contains(@class,'crossIcon popupSprite popupCrossIcon')")).click();
	  driver.findElement(By.id("hsw_search_button")).click();
	  
	  }
  
	 
  @BeforeMethod
  public void beforeMethod() {
	   
	  System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM1\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches",
			    Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
	  driver=new ChromeDriver(options);
	  driver.get("https://www.makemytrip.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.close();
  }

}
