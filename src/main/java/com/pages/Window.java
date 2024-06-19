package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Window {
	private static WebDriver driver;
	private By tb = By.xpath("//a[@id='opentab']");
	
//	constructor
	public Window(WebDriver driver) {
		Window.driver = driver;
	}


	public void tab() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(tb).click();

		// get the parent window handle

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		//get all window handles

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

//	 iterator among the windows

		Iterator<String> iterator = windowhandles.iterator();

		while(iterator.hasNext()) {

			String childwindow = iterator.next();

			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				String text1 = driver.findElement(By.xpath("//div[@class='cont']//span[contains(text(),'info@qaclickacademy.com')]")).getText();
				System.out.println(text1);
				driver.close();
			}


		}
	}
	
}
