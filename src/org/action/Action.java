package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\valli\\eclipse-workspace\\Actions\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a=new Actions(driver);
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(courses).perform();
		WebElement oracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
		a.doubleClick(oracle).perform();
		//hello saran how r u ????
		//Im fine......
		
		
	}

}
