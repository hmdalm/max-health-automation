package com.maxhealth;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Health_Care {
private static WebDriver driver;
@BeforeClass
public static void launch_Max_HealthCare() throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium webdrivers\\chromedriver.exe");
		 driver = new ChromeDriver();		
	driver.navigate().to("https://www.maxhealthcare.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.id("wzrk-cancel")).click();
	Thread.sleep(3000);
}
	@Test
	public void goTo_Hospital() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_1\"]")).click();
		Thread.sleep(5000);
		
		
}
	@Test
	public void goTo_Treatments() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_2\"]")).click();
		Thread.sleep(5000);
}
	@Test
	public void goTo_Services() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_4\"]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void goTo_Academics() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_5\"]")).click();
		Thread.sleep(5000);
}
	@Test
	public void goTo_INternational_Patients() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_international\"]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void goTo_Enquery() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"mega_toggle_quick_enquiry\"]")).click();
		Thread.sleep(5000);
	}
}
