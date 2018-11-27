package com.ibm.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadDriver {

	// Declaration of main method
	public static void main(String[] args) {

		// Setting the absolute path to load Chrome Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Creating object for Chrome Driver
		WebDriver driver = new ChromeDriver();

	}

}// End of Program
