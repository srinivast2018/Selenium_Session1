package com.ibm.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoadIeDriver {
	//Declaration of main method
	public static void main(String[] args) {
		
		// Setting the absolute path to load IE Driver
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		
		//Creating object for IE Driver
		WebDriver driver = new InternetExplorerDriver();
		
		System.out.println("Hello");
	}

}//End of program
