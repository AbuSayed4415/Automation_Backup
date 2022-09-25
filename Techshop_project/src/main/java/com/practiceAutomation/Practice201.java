package com.practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice201 {

	public static void open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abusa\\eclipse-workspace\\Techshop_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("5185678082");
		driver.findElement(By.id("pass")).sendKeys("Asmrasel@33");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}
	public static void main(String[] args) {
		Practice201.open();
	}
}
